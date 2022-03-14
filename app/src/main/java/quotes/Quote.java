package quotes;

public class Quote {

    private String qotd_date;
    private QuoteWrapper quote;

    public Quote(String qotd_date, QuoteWrapper quoteWrapper) {
        this.qotd_date = qotd_date;
        this.quote = quoteWrapper;

    }

    public String getQotd_date() {
        return qotd_date;
    }

    public void setQotd_date(String qotd_date) {
        this.qotd_date = qotd_date;
    }

    public QuoteWrapper getQuote() {
        return quote;
    }

    public void setQuote(QuoteWrapper quote) {
        this.quote = quote;
    }




    @Override
    public String toString() {
        return "Quote{" +
                "qotd_date='" + qotd_date + '\'' +
                ", Today's Quote=" + quote +
                '}';
    }
}

