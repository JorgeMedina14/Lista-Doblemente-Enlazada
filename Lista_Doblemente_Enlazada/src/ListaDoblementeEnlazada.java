public class ListaDoblementeEnlazada {
    Nodo inicio;
    Nodo fin;
    int tamanio;

    public ListaDoblementeEnlazada() {
        this.inicio = null;
        this.fin = null;
        this.tamanio = 0;
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
        tamanio++;
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
        tamanio++;
    }

    public void recorrerHaciaAdelante() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void recorrerHaciaAtras() {
        Nodo actual = fin;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    public int getSize() {
        return tamanio;
    }

    public boolean isEmpty() {
        return tamanio == 0;
    }

    public boolean buscarPorValor(int valor) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int buscarPorIndice(int indice) {
        if (indice < 0 || indice >= tamanio) {
            return -1;
        }
        Nodo actual = inicio;
        int contador = 0;
        while (contador < indice) {
            actual = actual.siguiente;
            contador++;
        }
        return actual.dato;
    }

    public void borrarElemento(int valor) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == valor) {
                if (actual == inicio) {
                    inicio = inicio.siguiente;
                    inicio.anterior = null;
                } else if (actual == fin) {
                    fin = fin.anterior;
                    fin.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                tamanio--;
                return;
            }
            actual = actual.siguiente;
        }
    }
}
