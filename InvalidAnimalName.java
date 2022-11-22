class InvalidAnimalName extends Exception {
    @Override
    public String getMessage() {
        return "You were rude! Go away!";
    }
}
