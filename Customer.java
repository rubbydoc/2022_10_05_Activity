public class Customer<T,T2>{
    private T name;
    private T2 password;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T2 getPassword() {
        return password;
    }

    public void setPassword(T2 password) {
        this.password = password;
    }

    public Customer(T name, T2 password) {
        this.name = name;
        this.password = password;

    }
}