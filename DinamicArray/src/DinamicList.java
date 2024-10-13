import java.util.Arrays;


/**
 * El uso de <> despues de DinamicList indica algo llamado "Generics"
 * 	Esto nos permite que la clase pueda usar cualquier tipo de dato
 * 	dentro de si misma. (Por asi decirlo, le decimos que su tipo de dato
 * 	es generico y por ende podemos usarlo como tipo de dato).
 * 
 * Cuando se inicialice una instancia, esta debe ser con el <> por delante
 * y el tipo de dato dentro, es decir:
 * DinamicList<String> DL = new DinamicList<>(5);
 */
public class DinamicList<Type> {
    
	@SuppressWarnings("unchecked") //si se quita, la linea del cast marca un warning porque no sabe el tipo de dato
	public DinamicList(){
		this.size = 0;
		this.array = (Type[]) new Object[0];
		/**
		 * Se usan parentesis en (Type[]) para poder generar un cast de tipo de datos, es decir
		 * que En object el tipo de dato es "generico" per una vez hecho el cast
		 * se convierte en lo que se le haya indicado al instanciarlo.
		 * 
		 * Se usa Object para definir un objeto base al cual colocarle los indices
		 */
    }

	private Type[] array;
	private int size;


	public void Add(Type item){
		if(this.size == this.array.length){
			Resize();

		}

		//separo la logica de this.array[this.size++] porque el size++ aumenta el valor de size
		//Y a la vez se le proporiona ese nuevo valor al array.
		int newSize = this.size++;
		this.array[newSize] = item;

	}

	public Type get(int index){
		//Error para cuando se accede a un index mas alla de los generados
		if( index >= this.size || index < 0 ){
			throw new IndexOutOfBoundsException("intentando acceder al index: " + index + 
			" siendo el array " + this.size);
			//hay que recordar que los arrays van de 0 a n numeros, 
			/**
			 * y se cuentan de la sig forma:
			 * 0	1	 2	  3	  4	  5     index
			 * 1	2	 3	  4	  5	  6     Normal
             * 
             * por eso si se intenta acceder al index 6 en un array tamaño 6 marcara error
			 */

		}

		return this.array[index];

	}

	public void Resize(){
		int newSize = this.array.length + 1;
		this.array = Arrays.copyOf(this.array, newSize);
		

	}

	public int CurrentSize(){
		return this.size;

	}


    public static void main(String[] args){
        
        DinamicList<String> listaDinamica = new DinamicList<>();

        System.out.println("Tamaño inicial: " + listaDinamica.CurrentSize());
        listaDinamica.Add("qwe");
        listaDinamica.Add("asd");
        listaDinamica.Add("zxc");
        listaDinamica.Add("rty");
        listaDinamica.Add("qwe");
        listaDinamica.Add("asd");
        System.out.println("Nuevo tamaño: " + listaDinamica.CurrentSize());
        // System.out.println(listaDinamica.get(6)); //Marcara error, array solo tiene 0 1 2 3 4 5 posiciones
        
        for (int i = 0; i<6; i++) {
            System.out.println("index " + i + " valor: " + listaDinamica.get(i));
        }

    }
}
