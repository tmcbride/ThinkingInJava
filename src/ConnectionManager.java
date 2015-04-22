/**
 * Created by tmcbride on 4/22/2015.
 */
public class ConnectionManager {
    private static Connection[] connections = new Connection[3];
    private static int conCount = 0;

    public Connection requestConnection() {
        if (conCount >= connections.length) {
            System.out.println("Connections are all full");
            return null;
        } else {
            connections[conCount] = Connection.getConnection(conCount);

            conCount++;

            return connections[conCount - 1];
        }
    }

    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();

        Connection test1 = cm.requestConnection();
        Connection test2 = cm.requestConnection();
        Connection test3 = cm.requestConnection();
        Connection test4 = cm.requestConnection();

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}

class Connection {
    private int conIndex;

    private Connection(int index) {
        System.out.println("Creating connection " + index);
        conIndex = index;
    }

    public static Connection getConnection(int index) {
        return new Connection(index);
    }

    public String toString() {
        return "This is connection " + conIndex;
    }
}

