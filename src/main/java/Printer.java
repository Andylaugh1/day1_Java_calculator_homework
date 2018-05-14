public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int print(int pages, int copies){
        int toPrint = pages * copies;
        if (toPrint<= this.sheets) {
            return this.sheets - toPrint;
        }
        else return 0;
    }

    public int refill(){
        return this.sheets = sheets;
    }

    public int reduceToner(int pages){
        return this.toner -= pages;
    }


}
