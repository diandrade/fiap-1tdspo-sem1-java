public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores Lógicos

        boolean souAdulto = true;
        boolean jaTenhoNivelSuperior = false;

        //AND ou E (&&)

        boolean resultadoComAnd = souAdulto && jaTenhoNivelSuperior;
        System.out.println("souAdulto && jaTenhoNivelSuperior = " + resultadoComAnd);

        //OR ou ou (||)
        boolean resultadocomOr = souAdulto || jaTenhoNivelSuperior;
        System.out.println("souAdulto || jaTenhoNivelSuperior = " + resultadocomOr);

        //Operador de Negação (!)
        System.out.println("Não(souAdulto || jaTenhoNivelSuperior) = " + !resultadocomOr);

    }
}
