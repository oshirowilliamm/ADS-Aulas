package Main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;  
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) {
        //Criando lista de funcionários
        List<Funcionario> func = new ArrayList<>();
        
        //Adicionando funcionários
        func.add(new Funcionario(1L, "Maria", LocalDate.of(2000,10,18), new BigDecimal("2009.44"), "Operador"));
        func.add(new Funcionario(2L, "João", LocalDate.of(1990,5,12), new BigDecimal("2284.38"), "Operador"));
        func.add(new Funcionario(3L, "Caio", LocalDate.of(1961,5,2), new BigDecimal("9836.14"), "Coordenador"));
        func.add(new Funcionario(4L, "Miguel", LocalDate.of(1988,10,14), new BigDecimal("19119.88"), "Diretor"));
        func.add(new Funcionario(5L, "Alice", LocalDate.of(1995,1,5), new BigDecimal("2234.68"), "Recepcionista"));
        func.add(new Funcionario(6L, "Heitor", LocalDate.of(1999,11,19), new BigDecimal("1582.72"), "Operador"));
        func.add(new Funcionario(7L, "Arthur", LocalDate.of(1993,3,31), new BigDecimal("4071.84"), "Contador"));
        func.add(new Funcionario(8L, "Laura", LocalDate.of(1994,7,8), new BigDecimal("3017.45"), "Gerente"));
        func.add(new Funcionario(9L, "Heloisa", LocalDate.of(2003,5,24), new BigDecimal("1606.85"), "Eletricista"));    
        func.add(new Funcionario(10L, "Helena", LocalDate.of(1996,9,2), new BigDecimal("2799.93"), "Gerente"));
        
        //Removendo João
        func.removeIf(f -> f.getNome().equals("João"));
 
        //Aumento de salário
        for (Funcionario f: func) {
            BigDecimal aumento = f.getSalario().multiply(new BigDecimal("0.10"));
            f.setSalario(f.getSalario().add(aumento));
        }
        
        //MAP
        Map<String, List<Funcionario>> map = new TreeMap<>();
        for (Funcionario f: func) {
            if (!map.containsKey(f.getFuncao())) {
                map.put(f.getFuncao(), new ArrayList<>());
            }
            map.get(f.getFuncao()).add(f);
        }
        
        //Aniversário
        List<Funcionario> aniv = new ArrayList<>();
        for (Funcionario f: func) {
            int mes = f.getDataNascimento().getMonthValue();
            if (mes == 10 || mes == 12) {
                aniv.add(f);
            }
        }
        
        //Maior idade
        Funcionario maisVelho = func.get(0);
        for (Funcionario f: func) {
            if (f.getDataNascimento().isBefore(maisVelho.getDataNascimento())) {
                maisVelho = f;
            }
        }
        
        //Total salario
        BigDecimal total = new BigDecimal("0");
        for (Funcionario f: func) {
            total = total.add(f.getSalario());
        }
  
        //Formatando
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        //Imprimindo funcionários
        System.out.println("Lista de Funcionarios: ");
        for (Funcionario f: func) {
            System.out.println(
                    "ID: " + f.getId() +
                    " | Nome: " + f.getNome() +
                    " | Data: " + f.getDataNascimento().format(data) +
                    " | Salario: " + moeda.format(f.getSalario()) +
                    " | Funcao: " + f.getFuncao()
            );
        }
        
        //Imprimindo aniversariantes
        System.out.println("================================================================================");
        System.out.println("Funcionarios que fazem aniversario nos meses 10 e 12: ");
        for (Funcionario a: aniv) {
            System.out.println(
                    a.getNome() + " - " + a.getDataNascimento().format(data)
            );
        }  
        
        //Imprimindo o mais velho
        System.out.println("================================================================================");
        int idade = Period.between(maisVelho.getDataNascimento(), LocalDate.now()).getYears();
        System.out.println(
                "O funcionario mais velho:" +
                "\n" + maisVelho.getNome() + " com " + idade + " anos"
        ); 
        
        //Imprimindo funcionários em ordem alfabética
        System.out.println("================================================================================");
        System.out.println("Lista de funcionarios em ordem alfabetica: ");
        func.sort((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
        for (Funcionario f: func) {
            System.out.println(
                    "ID: " + f.getId() +
                    " | Nome: " + f.getNome() +
                    " | Data: " + f.getDataNascimento().format(data) +
                    " | Salario: " + moeda.format(f.getSalario()) +
                    " | Funcao: " + f.getFuncao()
            );
        }
        
        //Imprimindo o total dos salários dos funcionários
        System.out.println("================================================================================");
        System.out.println("Total dos salarios dos funcionarios: ");
        System.out.println(moeda.format(total));
        
        //Imprimindo a quantidade de salários mínimos de cada funcionário
        System.out.println("================================================================================");
        System.out.println("Quantidade de salarios minimos que cada funcionario ganha: ");
        BigDecimal salMinimo = new BigDecimal("1212");
        for (Funcionario f: func) {
            BigDecimal qtd = f.getSalario().divide(salMinimo, 2, RoundingMode.HALF_UP);
            System.out.println(
                    "Nome: " + f.getNome() +
                    " | Quantidade de Salarios Minimos: " + qtd
            );
        }
        
        //Imprimindo os funcionários agrupados por função
        System.out.println("================================================================================");
        System.out.println("Funcionarios por funcoes: ");
        for (Map.Entry<String, List<Funcionario>> entry : map.entrySet()){
            System.out.println("Funcao: " + entry.getKey());    
            
            for (Funcionario f: entry.getValue()) {
                System.out.println("- " + f.getNome());
            }
        }
    }
}

