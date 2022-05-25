public class robolunar {
    public int bateria = 100;
    public int getBateria(){
        return bateria;
    }
    public void setBateria(){
        this.bateria -= 10;
    }
    public void Frente(){
        setBateria();
        System.out.println("\n O robô andou 1 metro para frente e essa ação consumiu 10% da sua bateria total, a bateria está em " + this.bateria + "% ");
        System.out.println("------------------------------------------------------------------------------------------------------------- \n");
    }
    public void Esquerda(){
        setBateria();
        System.out.println("\n O robô virou para a esquerda e essa ação consumiu 10% da sua bateria total, a bateria está em "+ this.bateria + "% ");
        System.out.println("------------------------------------------------------------------------------------------------------------- \n");
    }
    public void Direita(){
        setBateria();
        System.out.println("\n O robô virou para direita e essa ação consumiu 10% da sua bateria total, a bateria está em "+ this.bateria + "% ");
        System.out.println("------------------------------------------------------------------------------------------------------------- \n");
    }
    public void Tras(){
        setBateria();
        System.out.println("\n O robô andou 1 metro para trás e essa ação consumiu 10% da sua bateria total, a bateriá está em "+ this.bateria + "% ");
        System.out.println("------------------------------------------------------------------------------------------------------------- \n");
    }
    public void Foto(){
        setBateria();
        System.out.println("\n O robô tirou uma foto e essa ação consumiu 10% da sua bateria total, a bateria está em "+ this.bateria + "% ");
        System.out.println("------------------------------------------------------------------------------------------------------------- \n");
    }
}
