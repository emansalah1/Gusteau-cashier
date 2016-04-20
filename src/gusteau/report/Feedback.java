package gusteau.report;

public class Feedback {
    private int id;
    private int rate;

    /**
     * to get from backend
     * @param id
     * @param rate 
     */
    public Feedback(int id, int rate) {
        this.id = id;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
}
