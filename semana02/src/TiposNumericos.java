public class TiposNumericos {
    public static void main(String[] args) {

//      Tipos primitivos
//      * Inteiros
        byte minByteValue = -128; //8 bits
        byte maxByteValue = 127;

        System.out.println("Byte Value vai de " + minByteValue + " até " + maxByteValue);

        short minShortValue = -32768; //16 bits
        short maxShortValue = 32767;

        System.out.println("Short Value vai de " + minShortValue + " até " + maxShortValue);

        int minIntValue = -2147483648; //32 bits
        int maxIntValue = 2147483647;

        System.out.println("Int Value vai de " + minIntValue + " até " + maxIntValue);

        long minLongValue = -9223372036854775808L; //64 bits
        long maxLongValue = 9223372036854775807L;

        System.out.println("Long Value vai de " + minLongValue + " até " + maxLongValue);

        // *Decimais
        float minFloatValue = -3.4028235E38f; //32 bits -observar o E da notação científica
        float maxFloatValue = 3.4028235E38f;

        System.out.println("Float Value vai de " + minFloatValue + " até " + maxFloatValue);

        double minDoubleValue = -1.7976931348623157E308; //64 bits
        double maxDoubleValue = 1.7976931348623157E308;

        System.out.println("Double Value vai de " + minDoubleValue + " até " + maxDoubleValue);

        //Tipo lógico
        boolean valorLogicoPositivo = true;
        boolean valorLogicoNegativo = false;

        System.out.println("Boolean value pode ser " + valorLogicoNegativo + " ou " + valorLogicoPositivo);

        //Tipo caractere
        char minCharValue = 0; //16 bits

        // Tipos não primitivos ou tipos de referência
        //String
        String nome = "João";

        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + nome.toUpperCase());
        System.out.println("Nome: " + nome.toLowerCase());

        // Números inteiros

        Integer idade = 18;

        Long idadeLong = 18L;

        Double altura = 1.75;

        Float alturaFloat = 1.75f;

    }
}


