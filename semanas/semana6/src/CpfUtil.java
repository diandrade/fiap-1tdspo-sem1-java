public class CpfUtil {

    public static boolean isValidCpf(String cpf){
        //Verificação Simples
        return isLength11(cpf) && isReceitaFederalValido(cpf);
    }

    private static boolean isLength11(String cpf){
        return cpf.length() == 11;
    }

    private static boolean isReceitaFederalValido(String cpf){
        return true;
    }

}
