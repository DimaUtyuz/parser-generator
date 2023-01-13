grammar Grammar;
@header {
package grammar;
}

start
    : grammarName=grammar_name grammarType=type_name headerList=header ruleList=rule_list tokenList=token_list codePart=code_part EOF
    ;

grammar_name
    : 'grammar' name=NOT_WS ';'
    ;

type_name
    : 'type' name=CODE ';'
    |
    ;

header
    : '@header' headers=CODE
    ;

rule_list
    : rule=rule_obj tail=rule_list
    |
    ;

rule_obj
    : name=NOT_WS branchList=branch_list
    ;

branch_list
    : '|' headBranch=branch tail=branch_list
    | ';'
    ;

branch
    : elementList=element_list calcResult=calc_result
    | calcResult=calc_result
    ;

calc_result
    : val=CODE
    |
    ;

element_list
    : headElement=NOT_WS tail=element_list
    |
    ;

token_list
    : headToken=token tail=token_list
    |
    ;

token
    : name=NOT_WS ':' regex=REGEX tail=token_tail
    ;

token_tail
    : val='-> skip' calcResult=calc_result ';'
    | calcResult=calc_result val=';'
    ;

code_part
    : code=REGEX
    |
    ;

WS : [\t\r\n ]+ -> skip;
REGEX : '~' ~'~'+ '~';
CODE : '{' ~'}'+ '}';
NOT_WS : ~[\t\r\n ]+;
