package sem4hw;

public class Inn extends Tasks{
    @Override
    public long time() {
        return 4000;
    }

    @Override
    public int priority() {
        return 4;
    }

    @Override
    public String toString(){
        return "INN task needs: "+time()+", Priority: "+priority()+'\n';
    }
}
