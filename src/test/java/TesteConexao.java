public class TesteConexao {


    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (Exception e) {
            e.printStackTrace();
        }


//        Conexao conexao = null;
//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//            conexao.fecha();
//        } catch (IllegalMonitorStateException e) {
//            System.out.println("Deu erro");
//
//        } finally {
//            conexao.fecha();
//        }
    }
}
