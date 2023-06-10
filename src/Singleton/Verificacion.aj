

public aspect Verificacion {
    pointcut logMethod() : execution(* log(..));

    before() : logMethod() {
        Escritor logger = Escritor.getInstance();
        logger.log("Método log interceptado");
    }
}
