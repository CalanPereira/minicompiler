package lexer;

import com.sun.source.tree.ImportTree;

public class Keyword extends Token {
    public final String lexeme;

    public Keyword(String lexeme,int tag){
        super(tag);
        this.lexeme=lexeme;
    }

    public static final Keyword AND =new Keyword("and",Tag.AND),
            OR = new Keyword("or",Tag.OR),
            EQUAL = new Keyword("==",Tag.EQ),
            N_EQUAL = new Keyword("!=",Tag.NE),
            L_EQUAL = new Keyword("<=",Tag.LE),
            G_EQUAL = new Keyword(">=",Tag.GE),
            TRUE = new Keyword("True",Tag.TRUE),
            FALSE = new Keyword("False",Tag.FALSE),
            IF = new Keyword("if",Tag.IF),
            ELSE = new Keyword("else",Tag.ELSE),
            BREAK = new Keyword("break",Tag.BREAK),
            DO = new Keyword("do",Tag.DO),
            WHILE = new Keyword("while",Tag.WHILE),
            AS =new Keyword("as",Tag.AS),
            ASSERT =new Keyword("assert",Tag.ASSERT),
            CLASS =new Keyword("class",Tag.CLASS),
            CONTINUE =new Keyword("continue",Tag.CONTINUE),
            DEF =new Keyword("def",Tag.DEF),
            DEL = new Keyword("del",Tag.DEL),
            ELIF = new Keyword("elif",Tag.ELIF),
            EXCEPT = new Keyword("except",Tag.EXCEPT),
            FINALLY = new Keyword("finally",Tag.FINALLY),
            FOR =new Keyword("for",Tag.FOR),
            FROM = new Keyword("from",Tag.FROM),
            GLOBAL = new Keyword("global",Tag.GLOBAL),
            IMPORT = new Keyword("import",Tag.IMPORT),
            IN = new Keyword("in",Tag.IN),
            IS =new Keyword("in",Tag.IS),
            LAMDA = new Keyword("lamda",Tag.LAMBDA),
            NONE = new Keyword("none",Tag.NONE),
            NONLOCAL = new Keyword("nonlocal",Tag.NONLOCAL),
            NOT = new Keyword("not",Tag.NOT),
            PASS = new Keyword("pass",Tag.PASS),
            RAISE = new Keyword("raise",Tag.RAISE),
            RETURN = new Keyword("return",Tag.RETURN),
            TRY = new Keyword("try",Tag.TRY),
            WITH = new Keyword("with",Tag.WITH),
            YIELD = new Keyword("yield",Tag.YIELD);

}
