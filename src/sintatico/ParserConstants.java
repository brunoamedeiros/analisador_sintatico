package sintatico;
public interface ParserConstants
{
    int START_SYMBOL = 46;

    int FIRST_NON_TERMINAL    = 46;
    int FIRST_SEMANTIC_ACTION = 77;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  1,  1,  1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5,  8,  8,  8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  6,  6,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  7, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, 12, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, 22, 23, -1, -1, 24, 29, -1, 23, 32, -1, 33, 23, 34, 38, -1, -1, -1, 49, -1, 43, 21, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, -1, -1, 26, -1, -1, -1, -1, -1, -1, 25, -1, -1, -1, -1, -1, 25, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, 27, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, 31, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, 40, 40, 39 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 50, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, 50, 50, -1 },
        { -1, -1, -1, -1, -1, 52, 54, 55, 53, 56, 57, -1, -1, 51, 51, -1, -1, 51, -1, -1, -1, -1, -1, 51, -1, 51, -1, -1, 51, 51, -1, 51, -1, 51, -1, -1, -1, -1, -1, -1, 51, -1, -1, -1, -1 },
        { -1, 58, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, -1, -1, -1, 60, 60, -1 },
        { -1, 61, 62, -1, -1, 64, 64, 64, 64, 64, 64, -1, -1, 64, 64, -1, -1, 64, -1, -1, -1, -1, -1, 64, -1, 64, -1, -1, 64, 64, -1, 64, -1, 64, -1, -1, 63, -1, -1, -1, 64, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, 65, 65, -1 },
        { -1, 66, 66, 67, 68, 66, 66, 66, 66, 66, 66, -1, -1, 66, 66, -1, -1, 66, -1, -1, -1, -1, -1, 66, -1, 66, -1, -1, 66, 66, -1, 66, -1, 66, -1, -1, 66, 69, -1, -1, 66, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 71, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 72, -1, -1, -1, 73, 70, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 19, 43, 14, 47, 16 },
        { 50, 52, 55, 57 },
        { 43, 49 },
        {  0 },
        { 15, 43, 49 },
        { 20, 43,  6, 44, 14, 51 },
        {  0 },
        { 43,  6, 44, 14, 51 },
        {  0 },
        { 21, 48, 13, 54, 14, 53 },
        {  0 },
        { 48, 13, 54, 14, 53 },
        {  0 },
        { 25 },
        { 22, 43, 56, 14, 47, 14, 55 },
        {  0 },
        {  0 },
        { 17, 48, 13, 25, 18 },
        { 23, 59, 58, 24 },
        {  0 },
        { 14, 59, 58 },
        { 43, 12, 67 },
        { 57 },
        {  0 },
        { 27, 43, 60 },
        {  0 },
        { 17, 67, 61, 18 },
        {  0 },
        { 15, 67, 61 },
        { 28, 67, 29, 59, 62 },
        {  0 },
        { 30, 59 },
        { 31, 67, 32, 59 },
        { 33, 59, 34, 67 },
        { 35, 17, 63, 64, 18 },
        { 43 },
        {  0 },
        { 15, 63, 64 },
        { 36, 17, 65, 66, 18 },
        { 45 },
        { 67 },
        {  0 },
        { 15, 65, 66 },
        { 42, 67, 26, 74, 24 },
        { 44, 76, 13, 59, 75 },
        { 15, 44, 76 },
        {  0 },
        {  0 },
        { 14, 74 },
        { 40, 43, 12, 67, 41, 67, 32, 59 },
        { 69, 68 },
        {  0 },
        {  6, 69 },
        {  9, 69 },
        {  7, 69 },
        {  8, 69 },
        { 10, 69 },
        { 11, 69 },
        {  2, 71, 70 },
        {  3, 71, 70 },
        { 71, 70 },
        {  2, 71, 70 },
        {  3, 71, 70 },
        { 37, 71, 70 },
        {  0 },
        { 73, 72 },
        {  0 },
        {  4, 73, 72 },
        {  5, 73, 72 },
        { 38, 73, 72 },
        { 44 },
        { 17, 67, 18 },
        { 39, 73 },
        { 63 }
    };

    String[] PARSER_ERROR =
    {
        "Erro inesperado",
        "Era esperado fim de programa",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"*\"",
        "Era esperado \"/\"",
        "Era esperado \"=\"",
        "Era esperado \">\"",
        "Era esperado \">=\"",
        "Era esperado \"<\"",
        "Era esperado \"<=\"",
        "Era esperado \"<>\"",
        "Era esperado \":=\"",
        "Era esperado \":\"",
        "Era esperado \";\"",
        "Era esperado \",\"",
        "Era esperado \".\"",
        "Era esperado \"(\"",
        "Era esperado \")\"",
        "Era esperado \"PROGRAM\"",
        "Era esperado \"CONST\"",
        "Era esperado \"VAR\"",
        "Era esperado \"PROCEDURE\"",
        "Era esperado \"BEGIN\"",
        "Era esperado \"END\"",
        "Era esperado \"INTEGER\"",
        "Era esperado \"OF\"",
        "Era esperado \"CALL\"",
        "Era esperado \"IF\"",
        "Era esperado \"THEN\"",
        "Era esperado \"ELSE\"",
        "Era esperado \"WHILE\"",
        "Era esperado \"DO\"",
        "Era esperado \"REPEAT\"",
        "Era esperado \"UNTIL\"",
        "Era esperado \"READLN\"",
        "Era esperado \"WRITELN\"",
        "Era esperado \"OR\"",
        "Era esperado \"AND\"",
        "Era esperado \"NOT\"",
        "Era esperado \"FOR\"",
        "Era esperado \"TO\"",
        "Era esperado \"CASE\"",
        "Era esperado IDENT",
        "Era esperado INTEIRO",
        "Era esperado LITERAL",
        "<PROGRAMA> inv�lido",
        "<BLOCO> inv�lido",
        "<LID> inv�lido",
        "<REPIDENT> inv�lido",
        "<DCLCONST> inv�lido",
        "<LDCONST> inv�lido",
        "<DCLVAR> inv�lido",
        "<LDVAR> inv�lido",
        "<TIPO> inv�lido",
        "<DCLPROC> inv�lido",
        "<DEFPAR> inv�lido",
        "<CORPO> inv�lido",
        "<REPCOMANDO> inv�lido",
        "<COMANDO> inv�lido",
        "<PARAMETROS> inv�lido",
        "<REPPAR> inv�lido",
        "<ELSEPARTE> inv�lido",
        "<VARIAVEL> inv�lido",
        "<REPVARIAVEL> inv�lido",
        "<ITEMSAIDA> inv�lido",
        "<REPITEM> inv�lido",
        "<EXPRESSAO> inv�lido",
        "<REPEXPSIMP> inv�lido",
        "<EXPSIMP> inv�lido",
        "<REPEXP> inv�lido",
        "<TERMO> inv�lido",
        "<REPTERMO> inv�lido",
        "<FATOR> inv�lido",
        "<CONDCASE> inv�lido",
        "<CONTCASE> inv�lido",
        "<RPINTEIRO> inv�lido"
    };
}
