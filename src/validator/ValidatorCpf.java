package validator;

public class ValidatorCpf {

    public static void validatecpf(String cpf){
        cpf = retiraCaracteresEspeciais(cpf);
        validaConteudoDoCPF(cpf);
        validaNumerosRepetidos(cpf);

        String s1 = cpf.substring(0, 1); int n1 = Integer.parseInt(s1);
        String s2 = cpf.substring(1, 2); int n2 = Integer.parseInt(s2);
        String s3 = cpf.substring(2, 3); int n3 = Integer.parseInt(s3);
        String s4 = cpf.substring(3, 4); int n4 = Integer.parseInt(s4);
        String s5 = cpf.substring(4, 5); int n5 = Integer.parseInt(s5);
        String s6 = cpf.substring(5, 6); int n6 = Integer.parseInt(s6);
        String s7 = cpf.substring(6, 7); int n7 = Integer.parseInt(s7);
        String s8 = cpf.substring(7, 8); int n8 = Integer.parseInt(s8);
        String s9 = cpf.substring(8, 9); int n9 = Integer.parseInt(s9);

        int digito1 = (n1 * 10 + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7 * 4 + n8 * 3 + n9 * 2);
        if ((digito1 % 11) < 2) {
            digito1 = 0;
        }
        else {
            digito1 = 11 - (digito1 % 11);
        }

        int digito2 = (n1 * 11 + n2 * 10 + n3 * 9 + n4 * 8 + n5 * 7 + n6 * 6 + n7 * 5 + n8 * 4 + n9 * 3 + digito1 * 2);
        if ((digito2 % 11) < 2) {
            digito2 = 0;
        }
        else {
            digito2 = 11 - (digito2 % 11);
        }

        String confere = (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + digito1 +  digito2);

        if (confere.equals(cpf)){
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
    }

    public static String retiraCaracteresEspeciais(String cpf){
        cpf = cpf.replaceAll("\\.|-| |[a-zA-Z]", "");
        return cpf;
    }

    public static void validaConteudoDoCPF(String cpf){
        if (cpf.length() != 11){
            System.out.println("Inválido, o CPF deve possuir 11 digitos.");
            System.exit(0);
        }
    }

    public static void validaNumerosRepetidos(String cpf){
        char temp = cpf.charAt(0);
        boolean repetido = false;
        for (int i = 1; i < cpf.length(); i++) {
            if (temp == cpf.charAt(i)){
                repetido = true;
            }else {
                repetido = false;
            }
        }
        if (repetido){
            System.out.println("Inválido, o CPF digitado possui todos os digitos iguais.");
            System.exit(0);
        }
    }
}
