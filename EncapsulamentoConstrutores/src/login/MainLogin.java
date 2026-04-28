package login;

public class MainLogin {
    public static void main(String[] args) {

        System.out.println("=== TESTANDO CONSTRUTORES ===");


        Usuario u1 = new Usuario("111.111.111-11", "Alice", "91111-1111");
        System.out.println("Item A: " + u1);


        Usuario u2 = new Usuario("222.222.222-22", "Bob", "92222-2222", "bob@provedor.com");
        System.out.println("Item B (E-mail OK): " + u2);


        Usuario u3 = new Usuario("333.333.333-33", "Charlie", "93333-3333", "@charlie.com");
        System.out.println("Item B (E-mail Errado): " + u3);


        Usuario u4 = new Usuario("444.444.444-44", "Daisy", "94444-4444", "daisy@site.com", "123");
        System.out.println("Item C (Senha Curta): " + u4);


        Usuario u5 = new Usuario("555.555.555-55", "Edward", "95555-5555", "ed@edu.com", "senhaForte123");
        System.out.println("Item C (Tudo OK): " + u5);
    }
}

