public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException(String s) {
        super("Игрок с именем " + s + " не зарегистрирован");
    }
}
