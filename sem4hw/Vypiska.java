package sem4hw;

public class Vypiska extends Tasks{
    @Override
    public long time() {
        return 6000;
    }

    @Override
    public int priority() {
        return 6;
    }

    @Override
    public String toString(){
        return "Vypiska task needs: "+time()+", Priority: "+priority()+'\n';
    }
}
