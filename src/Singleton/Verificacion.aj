

public aspect Verificacion {
    pointcut logMethod() : execution(* log(..));

    before() : logMethod() {
        Escritor logger = Escritor.getInstancia();
        logger.log("Método log interceptado");
    }
}
