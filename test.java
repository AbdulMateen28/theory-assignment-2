public class test {
    public static void main(String[] args) {
        Server server = new Server();
        server.startServer(5000);
        Client client = new Client();
        client.startClient("127.0.0.1", 5000);
    }
}
