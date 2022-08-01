package sem4hw;

public class Snils extends Tasks{
    @Override
    public long time() {
        return 3000;
    }

    @Override
    public int priority() {
        return 3;
    }

    @Override
    public String toString(){
        return "Snils task needs: "+time()+", Priority: " + priority()+'\n';
    }
}
