package sem4hw;

public class Passport extends Tasks{
    @Override
    public long time() {
        return 5000;
    }

    @Override
    public int priority() {
        return 5;
    }

    @Override
    public String toString(){
        return "Passport task needs: "+time()+", Priority: "+priority()+'\n';
    }
}
