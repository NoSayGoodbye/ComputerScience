package by.it.akulov.lesson04;

class IntToStr {
    private static String numbToStr;
    private static final String[][] unitsTensHundreds = {{"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"", "десять", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто "},
            {"", "сто"}};
    private static final String[] tens = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
            "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать"};

    private static String Showing(int i) {
        int n100 = i / 100;
        int n10 = (i - (n100 * 100)) / 10;
        int n1 = i % 10;
        if (n10 == 1) {
            numbToStr = tens[n1];
        } else {
            numbToStr = unitsTensHundreds[2][n100] + unitsTensHundreds[1][n10] + unitsTensHundreds[0][n1];
        }
        return numbToStr;
    }

    static String ToCyr(int i) {
        numbToStr = Showing(i);
        return numbToStr;
    }
}
