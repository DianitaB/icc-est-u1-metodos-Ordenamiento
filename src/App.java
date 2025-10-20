public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros ={10, 0, -5, 5, 15, 2};
        SortBubble claseSortBubble = new SortBubble();
        System.out.println("Arreglo Original: ");
        claseSortBubble.printArray(numeros); 
        System.out.println(" Ordenado Ascendente: ");
        claseSortBubble.sortBubbleAscedente(numeros); 
        claseSortBubble.printArray(numeros);
        System.out.println("Ordenado Descencente: ");
        claseSortBubble.sortBubbleDescendente(numeros);
        claseSortBubble.printArray(numeros);
    }
}   
