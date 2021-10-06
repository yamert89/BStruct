package porokhin.bstruct;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static generated.GeneratedTypes.*;

%%

%{
  public _BasicLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _BasicLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
ID=[a-zA-Z_0-9]+
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
NUMBER=[0-9]+
LINE_COMMENT='.*

%%
<YYINITIAL> {
  {WHITE_SPACE}       { return WHITE_SPACE; }

  "="                 { return OP_EQ; }
  "|"                 { return OP_OR; }
  "?"                 { return OP_OPT; }
  "+"                 { return OP_ONEMORE; }
  "*"                 { return OP_ZEROMORE; }
  "&"                 { return OP_AND; }
  "!"                 { return OP_NOT; }
  "{"                 { return LEFT_BRACE; }
  "}"                 { return RIGHT_BRACE; }
  "["                 { return LEFT_BRACKET; }
  "]"                 { return RIGHT_BRACKET; }
  "("                 { return LEFT_PAREN; }
  ")"                 { return RIGHT_PAREN; }
  "dim"               { return DIM; }
  "sub"               { return SUB; }
  "declare"           { return DECLARE; }
  "include"           { return INCLUDE; }
  "as"                { return AS; }
  "if"                { return IF; }
  "end"               { return END; }
  "exit"              { return EXIT; }
  "integer"           { return T_INTEGER; }
  "string"            { return T_STRING; }

  {SPACE}             { return SPACE; }
  {ID}                { return ID; }
  {STRING}            { return STRING; }
  {NUMBER}            { return NUMBER; }
  {LINE_COMMENT}      { return LINE_COMMENT; }

}

[^] { return BAD_CHARACTER; }
