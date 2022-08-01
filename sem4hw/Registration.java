package sem4hw;

public class Registration extends Tasks{
    @Override
    public long time() {
        return 7000;
    }

    @Override
    public int priority() {
        return 7;
    }

    @Override
    public String toString(){
        return "Registration task needs: "+time()+", Priority: "+priority()+'\n';
    }
}
