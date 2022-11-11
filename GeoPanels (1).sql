
Create database GeoPanels;
Use GeoPanels;
go

Create table Empresa(
id_empresa int not null primary key identity(1,1),
nombre_empresa varchar(100) not null,
giro_comercial varchar(150) not null,
razon_social varchar(150) not null,
correo varchar(50) not null,
logo varchar(100),
registro_patronal varchar(17) not null,
direccion varchar(250) not null,
representante varchar(100)
);
---
Create table Departamentos(
id_departamento int not null primary key identity(1,1),
departamento varchar(150)
);
---
Create table Municipio(
id_municipio int not null primary key identity(1,1),
id_departamento int not null references Departamentos(id_departamento),
municipio varchar(200) not null
);
---
Create table Estado(
id_estado int not null primary key identity(1,1),
estado varchar(100)
);
---
Create table Establecimiento(
id_establecimiento int not null primary key identity(1,1),
ubicacion varchar(250) not null,
numero_telefonico varchar(9) not null,
nombre_establecimiento varchar(100),
id_municipio int not null references Municipio(id_municipio),
id_empresa int not null references Empresa(id_empresa),
id_estado int not null references Estado(id_estado)
);
---
Create table Preguntas(
id_pregunta int not null primary key identity(1,1),
pregunta varchar(100) not null,
);
---
Create table Tipo_empleado(
id_tipo_empleado int not null primary key identity(1,1),
tipo_empleado varchar(50)
);
---
create table Usuario(
id_usuario int not null primary key identity(1,1),
nombre varchar(100) not null,
apellido varchar(100) not null,
direccion varchar(250) not null,
numero_telefonico varchar(9) not null,
correo varchar(100) not null,
nombre_usuario varchar(50) not null,
contraseña varchar(50) not null,
fecha_nacimiento varchar(10) not null,
genero varchar(25),
id_estado int not null references Estado(id_estado),
id_tipo_empleado int not null references Tipo_empleado(id_tipo_empleado),
id_establecimiento int not null references Establecimiento(id_establecimiento),
perfil varchar(100),
primer_uso int
);
---
Create table Respuestas(
id_respuesta int not null primary key identity(1,1),
id_usuario int not null references Usuario(id_usuario),
id_pregunta1 int not null references Preguntas(id_pregunta),
respuesta1 varchar(100) not null,
id_pregunta2 int not null references Preguntas(id_pregunta),
respuesta2 varchar(100) not null,
id_pregunta3 int not null references Preguntas(id_pregunta),
respuesta3 varchar(100) not null,
id_pregunta4 int not null references Preguntas(id_pregunta),
respuesta4 varchar(100) not null
);
---
create table Codigo_recuperacion(
id_codigo int not null primary key identity(1,1),
codigo int not null,
estadoB char(1) not null,
id_usuario int not null references Usuario(id_usuario)
);
---
create table Marca(
id_marca int not null primary key identity(1,1),
marca varchar(50) not null,
);
---
create table Tipo_producto(
id_tipo_producto int not null primary key identity(1,1),
tipo_producto varchar(150),
);

create table Tipo(
id_tipo int not null primary key identity(1,1),
tipo varchar(50) not null,
);

---
create table Proveedor(
id_proveedor int not null primary key identity(1,1),
nombre_empresa varchar(100) not null,
nombre_proveedor varchar(100) not null,
numero_telefono varchar(9) not null,
correo varchar(100)
);
---
create table Producto(
id_producto int not null primary key identity(1,1),
sku varchar(16) not null,
nombre_producto varchar(100) not null,
descripcion varchar(250) not null,
precio decimal(6,2)not null,
id_marca int not null references Marca(id_marca),
id_tipo_producto int not null references Tipo_producto(id_tipo_producto),
id_tipo int not null references Tipo(id_tipo)
)
---
create table Compra(
id_compra int not null primary key identity(1,1),
cantidad int not null,
descripcion varchar(250) not null,
fecha varchar(10) not null,
id_proveedor int not null references Proveedor(id_proveedor),
id_producto int not null references Producto(id_producto),
id_establecimiento int not null references Establecimiento(id_establecimiento)
);
---
create table Inventario(
id_inventariado int not null primary key identity(1,1),
cantidad int,
fecha_ingreso varchar(10) not null,
id_establecimiento int not null references Establecimiento(id_establecimiento),
id_producto int not null references Producto(id_producto),
);
---
create table Cliente(
id_cliente int not null primary key identity(1,1),
nombre_cliente varchar(100) not null,
apellido_cliente varchar(100) not null,
dui varchar(10) not null,
direccion varchar(250) not null,
numero_telefonico varchar(9) not null,
correo varchar(50),
id_municipio int not null references Municipio(id_municipio),
);
---
create table Impuestos_producto(
id_impuesto int not null primary key identity(1,1),
precio decimal(6,2) not null,
fecha varchar(10),
impuesto varchar(150) not null
);
---
create table Carrito(
id_carrito int not null primary key identity(1,1),
carrito varchar(50) not null
);
---
create table elemento_Carrito(
id_elemento int not null primary key identity(1,1),
id_carrito int not null references Carrito(id_carrito),
id_inventario int not null references Inventario(id_inventariado),
cantidad int not null
);
---
create table Tipo_mantenimiento(
id_tipo_mantenimiento int not null primary key identity(1,1),
tipo_mantenimiento varchar(150) not null,
costo decimal(6,2) not null
);
---
create table Pago(
id_pago int not null primary key identity(1,1),
pago varchar(15) not null
)
---
create table Factura_producto(
id_factura int not null primary key identity(1,1),
fecha varchar(10) not null,
subtotal decimal(6,2) not null,
id_carrito int not null references Carrito(id_carrito),
id_costo int not null references Tipo_Mantenimiento(id_tipo_mantenimiento),
id_cliente int not null references Cliente(id_cliente),
id_impuesto int not null references Impuestos_producto(id_impuesto),
total decimal(6,2) not null,
id_pago int references Pago(id_pago),
);
---
create table Produccion(
id_produccion int not null primary key identity(1,1),
id_producto int not null references Producto(id_producto),
produccion varchar(250) not null,
);
create table Tipo_contrato(
id_tipo_contrato int not null primary key identity(1,1),
tipo_contrato varchar(100) not null
);
---
create table Contrato(
id_contrato int not null primary key identity(1,1),
mensualidad decimal(6,2) not null,
garantia varchar(250) not null,
fecha_inicio varchar(10) not null,
fecha_fin varchar(10) not null,
rendimiento varchar(150) not null,
costo int not null references Tipo_mantenimiento(id_tipo_mantenimiento),
produccion int not null references produccion(id_produccion),
recargo decimal(6,2) not null,
id_cliente int not null references Cliente(id_cliente),
id_tipo_contrato int not null references Tipo_contrato(id_tipo_contrato),
codigo int
);
---
create table Estado_mantenimiento(
id_estado int not null primary key identity(1,1),
estado varchar(20) not null
);
---
create table Mantenimiento_Generado(
id_mantenimiento int not null primary key identity(1,1),
fecha varchar(10) not null,
descripcion varchar(250) not null,
id_contrato int not null references Contrato(id_contrato),
id_tipo int not null references Tipo_mantenimiento(id_tipo_mantenimiento),
id_usuario int not null references Usuario(id_usuario),
id_estado_mantenimiento int not null references Estado_mantenimiento(id_estado)
);
---
create table Mantenimiento_Programado(
id_mantenimiento_programado int not null primary key identity(1,1),
fechayhora varchar(15),
descripcion varchar(250) not null,
id_contrato int not null references Contrato(id_contrato),
id_tipo int not null references Tipo_mantenimiento(id_tipo_mantenimiento),
id_usuario int not null references Usuario(id_usuario),
id_estado_mantenimiento int not null references Estado_mantenimiento(id_estado)
);


create table Factura_Mantenimiento(
id_facturaM int not null primary key identity(1,1),
fecha varchar(10) not null,
subtotal decimal(6,2) not null,
id_mantenimiento int not null references Mantenimiento_Generado(id_mantenimiento),
id_impuesto int not null references Impuestos_producto(id_impuesto),
total decimal(6,2) not null,
id_pago int not null references Pago(id_pago)
);
/*
select * from Mantenimiento_Generado
insert into Factura_Mantenimiento(fecha, subtotal, id_mantenimiento, id_impuesto,total,id_pago) Values('25-02-2020',24.25,7,1,34.25,1)
Insert into Factura_Mantenimiento_Programado(fecha, id_mantenimiento_programado, subtotal,id_impuesto,total,id_pago) Values('25-02-2020',5,24.25,2,34.25,1)
select * from Factura_Mantenimiento
select * from Estado_mantenimiento
select * from Mantenimiento_Programado
select id_facturaM, fecha, id_mantenimiento, total from Factura_Mantenimiento where id_pago = 1 order by id_facturaM desc
select id_mantenimiento, descripcion,fecha from Mantenimiento_Generado where id_mantenimiento = 7
select id_facturaMP, fecha, id_mantenimiento_programado, total from Factura_Mantenimiento_Programado where id_pago = 1 order by id_facturaMP desc
select id_mantenimiento_programado, descripcion,fechayhora from Mantenimiento_Programado where id_mantenimiento_programado = ?
select m.id_mantenimiento_programado,m.fechayhora,m.descripcion, t.Nombre_cliente,u.nombre_usuario,tm.costo from Mantenimiento_Programado m , Contrato c, Usuario u, Cliente t,Tipo_mantenimiento tm where m.id_contrato = c.id_contrato and c.id_cliente = t.id_cliente and u.id_usuario = m.id_usuario and m.id_tipo = tm.id_tipo_mantenimiento AND m.id_estado_mantenimiento = 2 order by m.id_mantenimiento_programado desc
*/
create table Factura_Mantenimiento_Programado(
id_facturaMP int not null primary key identity(1,1),
fecha varchar(10) not null,
subtotal decimal(6,2) not null,
id_mantenimiento_programado int not null references Mantenimiento_Programado(id_mantenimiento_programado),
id_impuesto int not null references Impuestos_producto(id_impuesto),
total decimal(6,2) not null,
id_pago int not null references Pago(id_pago)
);

Create table Bitacora(
id_accion int not null primary key identity(1,1),
usuario varchar(100) not null,
tabla_manipulada varchar (100) not null,
accion varchar(255) not null,
registro varchar(100) not null,
fechayhora varchar(15) not null
);

/*
Select * From Tipo_contrato
Select * From Mantenimiento_generado
	
Select * From Estado_mantenimiento
Select * From Tipo_mantenimiento
Select * From Contrato
Select * From Usuario

Select m.id_mantenimiento, m.fecha, m.descripcion, c.codigo, t.costo, d.nombre_usuario, o.estado From Mantenimiento_Generado m, Contrato c, Tipo_mantenimiento t, Usuario d, Estado_mantenimiento o Where m.id_contrato = c.id_contrato AND m.id_tipo = t.id_tipo_mantenimiento AND m.id_usuario = d.id_usuario AND m.id_estado_mantenimiento = o.id_estado
       

Select u.id_usuario, u.nombre, u.apellido, u.nombre_usuario, t.tipo_empleado From Usuario u, Tipo_empleado t WHERE u.id_tipo_empleado = t.id_tipo_empleado 

*/
---------------------------Insercciones-----------------------------

----Empresa-----
Insert into Empresa 
(nombre_empresa, giro_comercial, razon_social, correo, logo, registro_patronal, direccion, representante) 
values
('Diana', 'Giro comercial', 'Boquitas Diana', 'diana@gmail.com', 'dkfjañlckmpiwuhrertuqpc', 'A-12345-2020', 'San Salvador', 'Pardo'),
('Siman', 'Giro comercial', 'Almacenes Siman', 'siman@gmail.com', 'ñasdkfjpqoehncauidfha', 'B-12345-2020', 'Santa Ana', 'Marcos'),
('Boca Deli', 'Giro comercial', 'Boca Deli', 'bocadeli@gmail.com', 'ajñdksfqwpekcnkjbfqof', 'C-12345-2020', 'San Miguel', 'Alexis')
Select * From Empresa
----Departamentos-------
Insert into Departamentos
(departamento)
Values
('Ahuachapan'),
('Cabañas'),
('Chalatenango'),
('Cuscatlan'),
('La Libertad'),
('La Paz'),
('La Union'),
('Morazan'),
('San Miguel'),
('San Salvador'),
('San Vicente'),
('Santa Ana'),
('Sonsonate'),
('Usulutan')
Select * From Departamentos
-----Municipio---------------
Insert into Municipio
(Municipio, id_departamento)
Values
('San Salvador', 10),
('Aguilares', 10),
('Apopa', 10),
('Ayutuxtepeque', 10),
('Ciudad Delgado', 10),
('Cuscatancingo', 10),
('El Paisnal', 10),
('Guazapa', 10),
('Ilopango', 10),
('Mejicanos', 10),
('Nejapa', 10),
('Panchimalco', 10),
('Rosario de Mora', 10),
('San Marcos', 10),
('San Martin', 10),
('Santiago Texacuangos', 10),
('Santo Tomas', 10),
('Soyapango', 10),
('Tonacatepeque', 10),
('Ahuachapan', 1),
('Apaneca', 1),
('Atiquizaya', 1),
('Ataco', 1),
('El refugio', 1),
('Guaymango', 1),
('Jujutla', 1),
('San Francisco Menendez', 1),
('San Lorenzo', 1),
('San Pedro Puxtla', 1),
('Tacuba', 1),
('Turin', 1),
('Sensuntepeque', 2),
('Cinquera', 2),
('Dolores', 2),
('Guacotecti', 2),
('Ilobasco', 2),
('Jutiapa', 2),
('San Isidro', 2),
('Tejutepeque', 2),
('Victoria', 2),
('Chalatenango', 3),
('Agua Caliente', 3),
('Arcatao', 3),
('Azacualpa', 3),
('Citala', 3)

---------Estado------------
Insert into Estado
(estado)
values
('Activo'),
('inactivo')
Select * From Estado
-----------Establecimiento-----------------------
insert into Establecimiento
(ubicacion, numero_telefonico, nombre_establecimiento, id_municipio, id_empresa, id_estado)
values
('Soyapango', '2222-2222', 'Diana', 1, 1,1),
('Santa Tecla', '1111-1111', 'Siman', 30, 2,2),
('Suchitoto', '0000-0000', 'Boca Deli', 28, 3,2),
('Ciudad Arce', '3333-3333', 'CAES', 1, 2,1),
('Antiguo Cuscatlan', '4444-4444', 'Anda', 7, 1,2)
Select * From Establecimiento
----------------Preguntas-------------
Insert into Preguntas
(pregunta)
values
('¿Cual es el nombre de tu primera mascota?'),
('¿Cual es tu comida favorita?'),
('¿Cual es tu color favorito?'),
('¿Cual es el nombre de soltera de tu madre?'),
('¿Cual es el primer nombre de tu papa?')
Select * From Preguntas
-----------------Tipo_empleado-------------------------
Insert into Tipo_empleado
(tipo_empleado)
Values
('Gerente'),
('Cajero'),
('Administrador'),
('Tecnico'),
('Vendedor')
Select * From Tipo_empleado
-----------Usuario--------------------

Insert into Usuario
(nombre, apellido, direccion, numero_telefonico, correo, nombre_usuario, contraseña,fecha_nacimiento, genero, id_estado, id_tipo_empleado, id_establecimiento)
values
('Carlos', 'Granados', 'San Miguel', '7584-5824', 'Carlos@gmail.com', 'Alejandro', 'DUpzKCiOy/s=','02-08-2003','Masculino', 2, 3, 1)
Select * from Usuario
Select * from Tipo_empleado
------------------Respuesta---------------------------
Insert into Respuestas
(id_pregunta, id_usuario, respuesta)
values
(1, 1, 'Lulu'),
(2, 2, 'Carne'),
(1, 1, 'Azul'),
(2, 2, 'Pardo'),
(1, 1, 'Jose')
select * from Respuestas
---------------Codigo Recuperacion---------------------
Insert into Codigo_recuperacion
(codigo, estadoB, id_usuario)
Values
('1234', 'V', 1),
('4321', 'V', 2),
('5678', 'V', 2),
('8765', 'V', 1),
('0000', 'V', 2)
-----------------Marca-------------
Insert into Marca
(marca)
Values
('LG energy'),
('SunPower'),
('Winaico'),
('REC'),
('Trina Solar')
---------------Tipo Producto-----------------
Insert into Tipo_producto (tipo_producto)
values
('Panel Solar'),
('Contador de Energia'),
('Panel de silicio')
---------------Tipo----------------
Insert into Tipo
(tipo)
Values
('Fotovoltaico'),
('Termico'),
('Hibrido')
------------------Proveedor-----------
Insert into Proveedor
(nombre_empresa, nombre_proveedor, numero_telefono, correo)
Values
('Diana', 'LG', '1111-1111', 'lg@gmail.com'),
('Siman', 'SunPower', '2222-2222', 'sun@gmail.com'),
('Boca Deli', 'Winaico', '3333-3333', 'winaico@gmail.com'),
('Anda', 'REC', '5555-5555', 'rec@gmail.com'),
('Caes', 'Trina Solar', '0000-0000', 'trina@gmail.com')
-----------------------Producto---------------------
Insert into Producto (sku, nombre_producto, descripcion, precio, id_marca, id_tipo_producto, id_tipo)
values
('159753','Celdas Solares','Las celdas del panel solar',25.25,1,1,1),
('789123','Bateria','Bateria donde se guarda la energia',25.25,1,2,2),
('648248','Contador de Voltios','Contador para los paneles',25.25,3,3,3)
-------------------Compra--------------------------
Insert into Compra
(cantidad, descripcion,fecha, id_proveedor,id_producto,id_establecimiento)
Values
(20.52, 'Fotovoltaico','02-29-2020',1, 1, 2),
(15.32, 'Fotovoltaico','02-08-2019', 2, 2, 3),
(5.12, 'Hibrido','01-08-2018', 3, 3, 5),
(90.45, 'Termico','05-29-2020', 4, 2, 5),
(47.15, 'Fotovoltaico','02-29-2001', 5, 1, 2)
Select * From Compra
---------------------------Inventario-------------------
Insert into Inventario (cantidad,fecha_ingreso,id_establecimiento,id_producto)
values
(25,'05-22-2020',2,1),
(25,'02-18-2020',4,2),
(25,'07-31-2020',3,3)
Select * From Inventario
---------------------Cliente---------------
Insert into Cliente
(nombre_cliente, apellido_cliente, dui, direccion, numero_telefonico, correo, id_municipio)
Values
('Diego', 'Pardo', '12345678-9', 'San Salvador', '0000-0000', 'diego@gmail.com', 43),
('Matias', 'Garcia', '98765432-1', 'Soyapango', '1111-1111', 'matias@gmail.com', 35),
('Marcos', 'Hernandez', '01234567-8', 'Santa Tecla', '2222-2222', 'marcos@gmail.com', 1),
('Issela', 'Mejia', '10234567-9', 'Suchitoto', '3333-3333', 'issela@gmail.com', 36),
('Karen', 'Flores', '00143780-4', 'Santa Ana', '4444-4444', 'karen@gmail.com', 2)
----------------Impuesto producto----------
Insert into Impuestos_producto
(precio, fecha, impuesto)
Values
(9, '2019/11/24', 'Impuesto de servicios'),
(10, '2019/02/10', 'Impuesto de servicios'),
(5, '2019/10/02', 'Impuesto de servicios'),
(20, '2019/06/29', 'Impuesto de servicios'),
(7, '2019/08/09', 'Impuesto de servicios')
-------------Carrito----------------
Insert Into Carrito (carrito)
values
('Panel'),
('Bateria'),
('Celdas')
-------------elemento_Carrito-----------
Insert Into elemento_Carrito(id_carrito,id_inventario, cantidad)
values
(1,2,10),
(2,2,4),
(3,3,15)
-------------------Tipo de mantenimiento------------
Insert into Tipo_mantenimiento(tipo_mantenimiento,costo)
values
('Mantenimiento de celdas',50.25),
('Mantenimiento de baterias',25.25),
('Mantenimiento de paneles',50.25),
('Instalación de paneles',30.00),
('Sin Instalación',00.00)
-------------------Factura Producto----------------
Insert into Pago(pago) values('Pendiente'),('Realizado'),('Dimitido')
Insert into Factura_producto (fecha, subtotal, id_carrito, id_costo, id_cliente, id_impuesto,total,id_pago)
values
('02-29-2020',30,1,1,1,1,30.25,1),
('01-05-2020',60,2,2,2,2,59.99,1),
('05-17-2020',20,3,3,3,3,15.25,1)
select * from Factura_producto
------------------Produccion---------------------
Insert Into Produccion(id_producto, produccion)
values
(1,'25wts'),
(2,'50wts'),
(3,'15wts')
--------------------Tipo Contrato----------
Insert into Tipo_contrato(tipo_contrato)
values
('Contrato eventual'),
('Contrato temporal'),
('Contrato de relevo')
-------------------Contrato--------------
Insert into Contrato(mensualidad,garantia,fecha_inicio,fecha_fin,rendimiento,costo,produccion,recargo,id_cliente,id_tipo_contrato,codigo )
values
(56.25,'No pierda este contrato por que sirve como garantia','05-25-2015','05-25-2020','Rinde con exito',1,1,25.25,1,1,123),
(25.25,'No pierda este contrato por que sirve como garantia','05-25-2015','05-25-2019','Rinde con exito',2,2,25.25,2,1,432),
(21.25,'No pierda este contrato por que sirve como garantia','05-25-2010','05-25-2015','Rinde con exito',1,3,25.25,3,2,122)
-------------------Estado Mantenimiento-----------
Insert Into Estado_mantenimiento(estado)
Values
('Activo'),
('Inactivo')
Select * From Estado_mantenimiento
select * from contrato
-------------------Mantenimiento Generado----------
Insert Into Mantenimiento_Generado(fecha,descripcion,id_contrato,id_tipo,id_usuario,id_estado_mantenimiento)
values
('02-24-2019','Mantenimiento de panel',2,3,1,1),
('02-24-2019','Mantenimiento de bateria',3,2,1,2),
('02-24-2019','Mantenimiento de celdas',1,1,1,2)
--------------------Mantenimiento programado-------------
Insert Into Mantenimiento_Programado (fechayhora, descripcion, id_contrato, id_tipo, id_usuario, id_estado_mantenimiento)
values
('02-24-2020 3:50','Mantenimiento',1,3,1,1),
('01-25-2020 1:50','Mantenimiento',3,2,1,2),
('08-08-2020 2:50','Mantenimiento',2,1,1,1)
------------------Bitacora----------------------------
Insert Into Bitacora(usuario, accion, fechayhora)
values
(1,'Agregar un usuario','06-28-2019'),
(1,'Ha modificado un producto','01-05-2018'),
(1,'Se ha generado un reporte','04-14-2020')

/*

Select * from Tipo
Select * from Marca
Select * from Tipo_producto
select * from Producto
Select * from Empresa
Select * from Establecimiento
Select * from Bitacora
Select * from Usuario

select * from Tipo_producto where tipo_producto='Bateria'
Select * from producto

select id_marca from producto where nombre_producto = 'Bateria'

Select m.id_municipio, m.municipio, d.departamento from Municipio m, Departamentos d where m.id_departamento = d.id_departamento

select p.id_producto, p.sku, p.nombre_producto, p.descripcion, p.precio, m.marca, t.tipo_producto, l.tipo from Producto p, Marca m, Tipo_producto t, Tipo l where p.id_marca = m.id_marca and p.id_tipo_producto = t.id_tipo_producto and p.id_tipo = l.id_tipo and nombre_producto = 'Bateria'

Select u.id_usuario, u.nombre, u.apellido, u.direccion, u.numero_telefonico, u.correo, u.nombre_usuario, u.fecha_nacimiento, u.genero, es.estado, t.tipo_empleado, e.nombre_establecimiento from Usuario u, Estado es, Tipo_empleado t, Establecimiento e where u.id_estado = es.id_estado and u.id_tipo_empleado = t.id_tipo_empleado and u.id_establecimiento = e.id_establecimiento;
*/
---Triggers---
-------------------Trigger Pagar Factura-----------------------------------------
Create trigger Pagar_Factura
on Factura_producto
after update
as

    begin
        update Inventario set cantidad = ((select e.cantidad from Producto p, Inventario i, elemento_Carrito e, Factura_producto f
			where e.id_inventario = i.id_producto AND i.id_producto = p.id_producto and f.id_carrito = e.id_carrito and f.id_factura = (select MAX(id_factura) from Factura_producto))-(select i.cantidad from Producto p, Inventario i, elemento_Carrito e, Factura_producto f
			where e.id_inventario = i.id_producto AND i.id_producto = p.id_producto and f.id_carrito = e.id_carrito and f.id_factura = (select MAX(id_factura) from Factura_producto)))
		where id_inventariado = (select i.id_inventariado from Producto p, Inventario i, elemento_Carrito e, Factura_producto f
where e.id_inventario = i.id_producto AND i.id_producto = p.id_producto and f.id_carrito = e.id_carrito and f.id_factura = (select MAX(id_factura) from Factura_producto))
	end
-------------------Trigger Compra para Inventario--------------------------------
Create Trigger Crear_Trig_Compra
on Compra
after insert 
as

begin 

declare @cantidad int;
declare @id_producto int;
declare @id_establecimiento int;

select @cantidad = i.cantidad from inserted i;
select @id_producto = i.id_producto from inserted i;
select @id_establecimiento = i.id_establecimiento from inserted i;

insert into Inventario (cantidad, fecha_ingreso, id_establecimiento, id_producto)
Values (@cantidad, GETDATE(), @id_establecimiento, @id_producto)

end

-------------------Trigger Mantenimiento_Generado--------------------------------
create trigger Crear_Registro_Mantenimiento_Generado
on Mantenimiento_Generado
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.fecha from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Mantenimiento Generado','a insertado un nuevo Mantenimiento Generado en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Mantenimiento_Generado
on Mantenimiento_Generado
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.fecha from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Mantenimiento Generado','a actualizado un Mantenimiento Generado en la base de datos',@registro,GETDATE())
    end

----------------Trigger Mantenimiento_Programado----------------------
create trigger Crear_Registro_Mantenimiento_Programado
on Mantenimiento_Programado
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.fechayhora from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Mantenimiento Programado','a insertado un nuevo Mantenimiento Programado en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Mantenimiento_Programado
on Mantenimiento_Programado
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.fechayhora from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Mantenimiento Programado','a actualizado un Mantenimiento Programado en la base de datos',@registro,GETDATE())
    end

----------------Trigger Contrato----------------

create trigger Crear_Registro_Contrato
on Contrato
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.fecha_inicio from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Contrato','a insertado un nuevo Contrato en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Contrato
on Contrato
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.fecha_inicio from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Contrato','a actualizado un Contrato en la base de datos',@registro,GETDATE())
    end

--------------------Trigger Factura_producto------------------------------

create trigger Crear_Registro_Factura_producto
on Factura_producto
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.fecha from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Factura Producto','a insertado una nueva Factura de Producto en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Factura_producto
on Factura_producto
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.fecha from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Factura Producto','a actualizado una Factura de Producto en la base de datos',@registro,GETDATE())
    end



------------------Trigger Cliente---------------------------------------

create trigger Crear_Registro_Cliente
on Cliente
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_cliente from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Cliente','a insertado un nuevo Cliente en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Cliente
on Cliente
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_cliente from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Cliente','a actualizado un Cliente en la base de datos',@registro,GETDATE())
    end

-----------------Trigger Compra-------------------------------------

create trigger Crear_Registro_Compra
on Compra
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.fecha from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Compra','a insertado una nueva Compra en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Compra
on Compra
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.fecha from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Compra','a actualizado una Compra en la base de datos',@registro,GETDATE())
    end



--------------------Trigger Proveedor--------------------------------

create trigger Crear_Registro_Proveedor
on Proveedor
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_proveedor from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Proveedor','a insertado un nuevo Proveedor en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Proveedor
on Proveedor
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_proveedor from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Proveedor','a actualizado un Proveedor en la base de datos',@registro,GETDATE())
    end

------------------Trigger Producto-------------------------

create trigger Crear_Registro_Producto
on Producto
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_producto from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Producto','a insertado un nuevo Producto en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Producto
on Producto
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_producto from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Producto','a actualizado un Producto en la base de datos',@registro,GETDATE())
    end



------------------Trigger Empleados----------------------

create trigger Crear_Registro_Usuario
on Usuario
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Usuario','a insertado un nuevo Empleado en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_Usuario
on Usuario
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Usuario','a actualizado un Empleado en la base de datos',@registro,GETDATE())
    end

---------------Trigger Empresa---------------------------

create trigger Actualizar_Registro_Empresa
on Empresa
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_empresa from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Empresa','a actualizado los datos de la Empresa en la base de datos',@registro,GETDATE())
    end

-------------Trigger Establecimiento------------------

create trigger Crear_Registro_Establecimiento
on Establecimiento
after insert
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_establecimiento from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Establecimiento','a insertado un nuevo Establecimiento en la base de datos',@registro,GETDATE())
    end

create trigger Actualizar_Registro_nombre_establecimiento
on Establecimiento
after update
as

    begin
        declare @registro varchar(100);
        select @registro=i.nombre_establecimiento from inserted i; 
        insert into Bitacora (usuario, tabla_manipulada, accion, registro, fechayhora ) values (SUSER_NAME(),'Establecimiento','a actualizado un Establecimiento en la base de datos',@registro,GETDATE())
    end

create procedure combomarca
as
select*from estado
go

create procedure tiopp
as
select*from tipo_mantenimiento
go

create procedure tecnico
as
select*from usuario
go

create procedure contra
as
select*from usuario
go

/*
select * from Producto
select * from Inventario
select * from Elemento_carrito
select * from Factura_Producto
select f.id_factura, f.subtotal, f.total, Concat(c.nombre_cliente, c.apellido_cliente)As Cliente, concat(ip.impuesto,' $',ip.precio)as impuesto from Factura_Producto f, Cliente c, Impuestos_producto ip
where f.id_cliente = c.id_cliente AND f.id_pago = 2 AND f.id_factura = ?

select p.nombre_producto,p.descripcion, e.cantidad, p.precio from Producto p, Inventario i, elemento_Carrito e, Factura_producto f
where e.id_inventario = i.id_producto AND i.id_producto = p.id_producto and f.id_carrito = e.id_carrito and f.id_factura = ?

select p.nombre_producto,p.descripcion, e.cantidad, concat('$',p.precio)as precio from Producto p, Inventario i, elemento_Carrito e, Factura_producto f
where e.id_inventario = i.id_producto AND i.id_producto = p.id_producto and f.id_carrito = e.id_carrito and f.id_factura = 3

select p.nombre_producto,p.descripcion, e.cantidad, concat('$',p.precio)as precio from Producto p, Inventario i, elemento_Carrito e, Factura_producto f
where e.id_inventario = i.id_producto AND i.id_producto = p.id_producto and f.id_carrito = e.id_carrito and f.id_factura = 3*/