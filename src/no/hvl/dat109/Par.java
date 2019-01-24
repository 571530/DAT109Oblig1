package no.hvl.dat109;

public class Par<T> {


    private T t1;
    private T t2;

    public Par(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Par)) return false;
        Par p = (Par) o;

        return t1 == p.t1 && t2 == p.t2  || t1 == p.t2 && t2 == p.t1;
    }

    public boolean contains(T t) {
        return t1==t || t2==t;
    }

    public boolean contains(Par<T> p) {
        return contains(p.getT1()) ||  contains(p.getT2());
    }
}