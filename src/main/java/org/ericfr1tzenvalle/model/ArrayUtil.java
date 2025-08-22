package org.ericfr1tzenvalle.model;

public class ArrayUtil {

    /*count(vetor, elemento): conta o número de ocorrências de elemento em vetor e retorna
    (int). Perceba que a forma genérica de comparar se dois objetos são iguais é o “equals” e
    não o “==” e como o vetor é genérico, poderá ser de Integer mas poderá ser por exemplo
    de “String”. Faça os devidos testes para Integers e Strings. *\
     */

    public  static <T,V> int count(T[] vetor, V elemento){
        int contador = 0;
        for(T item: vetor){
            if(item.equals(elemento)){
                contador++;
            }
        }
        return contador;
    }
    /* max(vetor): retorna o maior elemento de um vetor. Perceba que nesse caso, para que o
    algoritmo seja genérico, deverá utilizar o método compareTo da interface Comparable.
    Caso o vetor seja nulo ou vazio lance uma IllegalArgumentException com a mensagem:
    “Array vazio ou null”. Faça os devidos testes para Integers e Strings.

     */
    public static <T extends Comparable<T>> T max(T[] vetor){
      if(vetor == null || vetor.length == 0){
          throw new IllegalArgumentException("O vetor está vazio");
      }
      T max = vetor[0];
      for(T item: vetor){
          if(item.compareTo(max)>0){
             max = item;
          }

      }
      return max;
    }
    /* min(vetor): equivalente ao exercício 2 mas retorna o mínimo valor.
    \*
     */
    public static <T extends Comparable<T>> T min(T[] vetor){
        if(vetor == null || vetor.length == 0){
            throw new IllegalArgumentException("O vetor está vazio");
        }
        T min = vetor[0];
        for(T item: vetor){
            if(item.compareTo(min)<0){
                min = item;
            }
        }
        return min;
    }




}
