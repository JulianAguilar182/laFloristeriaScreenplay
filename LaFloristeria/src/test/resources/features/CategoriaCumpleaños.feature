#language: es
Característica: agregar producto al carrito y eliminarlo
  Yo como usuario quiero agregar un producto al carrito en la categoria cumpleaños para luego borrarlo
  Escenario: agregar productos al carrito  y eliminarlo exitoso
    Dado que el usuario ingresa a la pagina floristeriamundoflor.com y le da click en la categoria cumpleaños
    Cuando el usuario seleccione un producto cualquiera
    Entonces el usuario lo puede visualizar en el carrito de compras para eliminarlo.