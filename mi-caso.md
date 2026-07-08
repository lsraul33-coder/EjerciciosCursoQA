# Mi caso de automatización - [Raul]

## 1.Flujo elegido: Ordenamiento del inventario (por precio, por nombre) 
Una vez que estemos en la sección de inventario de productos, seleccionar una de las 4 opciones de ordenamiento y verificar que se hayan reordenado según el criterio seleccionado.

## 2.¿Porqué automatizar este flujo? (3 razones mínimo) 
1. Este flujo es principal y repetitivo cada vez que el catálogo sufre cambios (altas, bajas, modificaciones).
2. En catálogos grandes la revisión manual del ordenamiento es tediosa y se presta a no detectar errores.
3. El tiempo de revisión manual del ordenamiento es muy alto.
4. Tomar en cuenta necesidades del cliente.

## 3.Lo que necesito saber antes de tocar código
- Las secciones del sistema en donde aparece el inventario y su ordenamiento. 
- Cantidad de productos en inventario.
- Si el módulo de inventarios está completo o aún tendrá cambios.
- Notificación en caso de cambios en catálogos (cambio de precios, nombres, características)
- Que mensaje debo mostrar en caso de que por algún error no se pueda ordenar.
- Tiempos actuales que toma el ordenamiento para el inventario actual.
- Tiempos aceptables que toma el ordenamiento actual.
- Valores límite. Cuantos caracteres usó dev para ordenamiento.

## 4.Lo que NO automatizaría (2 mínimo)
- La revisión de la descripción del producto (validaría que existiera pero no el contenido)
- En el alcance del ordenamiento no automatizaría que funcione el detalle del producto al ordenar (ese lo haría en otro flujo de validación)

## dudas-tareas
- Existen nombres estándar para los objetos? o se nombran dependiendo del lenguaje usado?
- Flujo completo para subir archivo a repositorio
