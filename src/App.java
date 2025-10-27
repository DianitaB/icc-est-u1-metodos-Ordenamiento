public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros ={10, 0, -5, 5, 15, 2};
        System.out.println("Estudiante: Diana Borja");
        SortBubble claseSortBubble = new SortBubble();
        SortSelection claseSelection = new SortSelection();
        SortInsertion claseInsertion = new SortInsertion();
        //BURBUJA
       // System.out.println("Arreglo Original: ");
        // claseSortBubble.printArray(numeros); 
       // System.out.println(" Ordenado Ascendente: ");
        //claseSortBubble.sortBubbleAscedente(numeros); 
        //claseSortBubble.printArray(numeros);
        //System.out.println("Ordenado Descencente: ");
        //claseSortBubble.sortBubbleDescendente(numeros);
        //claseSortBubble.printArray(numeros);

        // SELECCION

        //System.out.println("-- Metodo Selection -- ");
        //System.out.println("Arreglo Original: ");
        //claseSortBubble.printArray(numeros); 
        //claseSelection.sortAscendente(numeros);
        //System.out.println("Arreglo Ordenado Ascendente:");
        //claseSelection.printArray(numeros);
        //claseSelection.sortDescendente(numeros);
        //System.out.println("Arreglo Ordenado Descendente: ");
        //claseSelection.printArray(numeros);

        // INSERCIÓN
        System.out.println("--- Método Insertion ---");
        System.out.println("Arreglo Original");
        claseInsertion.printArray(numeros);
        claseInsertion.sortInsertionAscendente(numeros,false);
        System.out.println("Arreglo Ordenado Ascendente");
        claseInsertion.sortInsertionAscendente(numeros, false);
        claseInsertion.printArray(numeros);  
        System.out.println("Arreglo Ordenado Descendente");
        claseInsertion.sortInsertionDescendente(numeros, false);
        claseInsertion.printArray(numeros); 
        
        //INSERCIÓN - NOMBRES CADENAS
        String [] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        System.out.println("Estudiante : Diana Borja");
        System.out.println("Array de Nombres Original: ");
        claseInsertion.printArrayNombres(nombres);
        claseInsertion.sortByName(nombres);
        System.out.println("Ordenado por Nombre: ");
        claseInsertion.printArrayNombres(nombres);



        //INSERCIÓN NOMBRES
         Persona [] personas = new Persona[]{
            new Persona ("Pedro",30),
            new Persona ("Ana",25),
            new Persona ("Maria",28),
        };
        System.out.println("Estudiante: Diana Borja");
        System.out.println("Array de Personas Original: ");
        claseInsertion.printArrayPersonas(personas);
        System.out.println("\nOrdenado por Nombres de Personas: ");
        claseInsertion.sortPersonasByName(personas);
        claseInsertion.printArrayPersonas(personas);

        //INSERCIÓN EDADES
        System.out.println("Estudiante: Diana Borja ");
        System.out.println("Array de Personas Original: ");
        claseInsertion.printArrayPersonas(personas);
        System.out.println("\nOrdenado por Edad de Personas: ");
        claseInsertion.sortPersonasByAge(personas);
        claseInsertion.printArrayPersonas(personas);
    }
}   
