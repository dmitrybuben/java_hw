package sem4hw;

public class Spravka extends Tasks{
    @Override
    public long time() {
        return 2000;
    }

    @Override
    public int priority() {
        return 2;
    }

    @Override
    public String toString(){
        return "Spravka task needs: "+time()+", Priority: "+priority()+'\n';
    }
}
