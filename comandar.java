import java.util.Scanner;
public class comandar {
    public static void main(String[] args) {
        robolunar robo = new robolunar();
        robo.bateria = 100;
        String escolha = "";

        do {
            if (robo.bateria > 10){
                System.out.println("+------------------------------------------------+");
                System.out.println("|   Qual é o Próximo movimento do Robô Lunar?:   |");
                System.out.println("|   F    - Andar 1 metro pra Frente              |");
                System.out.println("|   E    - Virar para Esquerda                   |");
                System.out.println("|   D    - Virar para Direita                    |");
                System.out.println("|   T    - Andar pra 1 metro Trás                |");
                System.out.println("|   FT   - Tirar Foto                            |");
                System.out.println("|   ESC  - Para sair do acesso remoto ao robô    |");
                System.out.println("+------------------------------------------------+\n");
                Scanner leitor = new Scanner (System.in);
                escolha = leitor.nextLine();

                if (escolha.equalsIgnoreCase("f")){
                    robo.Frente();
                } else if (escolha.equalsIgnoreCase("e")){
                    robo.Esquerda();
                } else if (escolha.equalsIgnoreCase("d")){
                    robo.Direita();
                } else if (escolha.equalsIgnoreCase("t")){
                    robo.Tras();
                } else if (escolha.equalsIgnoreCase("ft")){
                    robo.Foto();
                } else if (escolha.equalsIgnoreCase("esc")){
                    System.out.println("\nAdeus Robô Lunar, desconectando-se.......\n");
                    break;
                } else{
                    System.out.println("Função inválida, digite novamente um comando!");                
                }
                
            } else if(robo.bateria >= 10){
                System.out.println("O Robô Lunar está com 10% de sua bateria, ligando painéis solares para recarregar");
                robo.bateria = 100;
            }
        } while(escolha != "ESC");
    } 
}