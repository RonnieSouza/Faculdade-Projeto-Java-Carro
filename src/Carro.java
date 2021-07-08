import java.util.Scanner;

public class Carro {
    String fabricante, modelo, cor, placa;
    int numeroPortas, anoFabricacao, anoModelo;
    float valor;

    //declaração dos metodos
    public void setFabricante(String fab) {
        if (!fab.isEmpty()) {
            fabricante = fab;
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setModelo(String mod) {
        if (!mod.isEmpty()) {
            modelo = mod;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String c) {
        if (!c.isEmpty()) {
            cor = c;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setPlaca(String pl) {
        if (!pl.isEmpty()) {
            placa = pl;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setNumeroPortas(int np) {
        if (np >= 2 && np <= 5) {
            numeroPortas = np;
        }
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setAnoFabricacao(int af) {
        if (af >= 2000 && af <= 2050) {
            anoFabricacao = af;
        }
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoModelo(int am) {
        if (am >= 2000 && am <= 2050) {
            anoModelo = am;
        }
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setValor(float v) {
        if (v >= 0) {
            valor = v;
        }
    }

    public float getValor() {
        return valor;
    }

    public void imprimir() {
        System.out.println("----------------------------------------");
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Valor: " + getValor());
        System.out.println("Numero de Portas: " + getNumeroPortas());
        System.out.println("Ano de Fabricacao: " + getAnoFabricacao());
        System.out.println("Ano de Modelo: " + getAnoModelo());
        System.out.println("----------------------------------------");
    }

    public void entraDados() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o Fabricante do carro :");
        setFabricante( entrada.nextLine() );
        System.out.println("Digite o Modelo do carro :");
        setModelo( entrada.nextLine() );
        System.out.println("Digite a Cor do carro :");
        setCor( entrada.nextLine() );
        System.out.println("Digite a Placa do carro :");
        setPlaca( entrada.nextLine() );
        System.out.println("Digite o Valor do carro :");
        setValor( Float.parseFloat( entrada.nextLine()) );
        System.out.println("Digite o Número de Portas do carro :");
        setNumeroPortas( Integer.parseInt( entrada.nextLine()) );
        System.out.println("Digite o Ano de fabricação do carro :");
        setAnoFabricacao( Integer.parseInt( entrada.nextLine()) );
        System.out.println("Digite o Ano do Modelo do carro :");
        setAnoModelo( Integer.parseInt( entrada.nextLine()) );

    }

}
