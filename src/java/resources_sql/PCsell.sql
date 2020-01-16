/**
 * Author:  706 informática
 * Created: 13/01/2020
 */

-- CREACION DE LA TABLA DONDE SE ALMACENAN LAS RUTAS DE LAS IMAGENES
create table imagen(
	id bigserial not null,
	nombre text not null,
	tipo text not null,
	ruta text not null,
	constraint pk_imagen primary key(id)
);

-- CREACION DE LA TABLA DE USUARIO
create table usuario(
	id bigserial not null,
	nombre text,
	apellidos text,
	coreo_electronico text not null,
	contrasenia text not null,
	constraint pk_usuario primary key(id)
);

-- ---------------------------------------------------------
-- CREACION DE LAS TABLAS PARA EL PROYECTO DE VENTA DE PC´S
-- ---------------------------------------------------------
create table marca_procesador(
	id bigserial not null,
	nombre text not null,
	imagen bigserial not null,
	constraint pk_procesador_marca primary key(id),
	constraint fk_mp_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);
create table procesador(
	id bigserial not null,
	marca bigserial not null,
	modelo text not null,
	imagen bigserial not null,
	nucleos integer not null,
	hilos_de_procesamiento integer,
	frecuencia_base decimal,
	tdp decimal,
	precio decimal not null,
	cantidades integer,
	descripcion text,
	constraint pk_procesador primary key(id),
	constraint fk_procesador_marca foreign key(marca) references marca_procesador(id) on delete cascade on update cascade,
	constraint fk_procesador_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);

create table disipador_calor(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	imagen bigserial not null,
	tdp decimal,
	tubos_termicos integer,
	ancho decimal,
	alto decimal,
	precio decimal not null,
	cantidad integer,
	descripcion text,
	constraint pk_disipador primary key(id),
	constraint fk_disipador_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);

create table tamanio_tm(
	id bigserial not null,
	tamanio text not null,
	constraint pk_tamanio_tm primary key(id)
);

create table tarjeta_madre(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	imagen bigserial not null,
	ram text not null,
	almacenamiento text not null,
	precio decimal not null,
	cantidad integer,
	descripcion text,
	tamanio bigserial not null,
	procesador bigserial not null,
	constraint pk_tarjeta_madre primary key(id),
	constraint fk_tamanio_tm foreign key(tamanio) references tamanio_tm(id) on delete cascade on update cascade,
	constraint fk_tarjeta_procesador foreign key(procesador) references marca_procesador(id) on delete cascade on update cascade,
	constraint fk_tm_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);

create table memoria_ram(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	imagen bigserial not null,
	velocidad decimal not null,
	capacidad integer not null,
	precio decimal not null,
	tipo text,
	cantidad integer,
	descripcion text,
	constraint pk_memoria_ram primary key(id),
	constraint fk_ram_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);

create table disco_duro(
	id bigserial,
	marca text not null,
	modelo text not null,
	imagen bigserial not null,
	factor_de_forma text not null,
	rpm integer not null,
	interfaz text not null,
	capacidad integer not null,
	tipo text,
	precio decimal not null,
	descripcion text,
	constraint pk_disco_duro primary key(id),
	constraint fk_disco_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);

create table tarjeta_video(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	imagen bigserial not null,
	vram text not null,
	ram integer not null,
	conexion text,
	descripcion text,
	precio decimal not null,
	cantidad integer,
	constraint pk_tarjeta_video primary key(id),
	constraint fk_tv_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);

create table gabinete(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	imagen bigserial not null,
	tamaño text not null,
	tamanio_tm bigserial not null,
	descripcion text,
	precio decimal not null,
	cantidad integer,
	constraint pk_gabinete primary key(id),
	constraint fk_tamanio_gabinete foreign key(tamanio_tm) references tamanio_tm(id) on delete cascade on update cascade,
	constraint fk_gabinete_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);

create table fuente_poder(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	imagen bigserial not null,
	tamanio_tm bigserial not null,
	precio decimal not null,
	cantidad integer,
	descripcion text,
	constraint pk_fuente primary key(id),
	constraint fk_fuente_tm foreign key(tamanio_tm) references tamanio_tm(id) on delete cascade on update cascade,
	constraint fk_fuentepoder_imagen foreign key(imagen) references imagen(id) on delete cascade on update cascade
);

create table procesador_disipador(
        id bigserial not null,
	procesador bigserial not null,
	disipador bigserial not null,
	constraint pk_procesador_disipador primary key(id),
	constraint fk_procesador foreign key(procesador) references marca_procesador(id) on delete cascade on update cascade,
	constraint fk_disipador foreign key(disipador) references disipador_calor(id) on delete cascade on update cascade
);

create table computadora(
	id bigserial not null,
	procesador bigserial not null,
	disipador bigserial not null,
	tarjeta_madre bigserial not null,
	memoria_ram bigserial not null,
	memoria_ram_adicional bigserial not null,
	disco_duro bigserial not null,
	disco_duro_adicional bigserial not null,
	tarjeta_video bigserial not null,
	gabinete bigserial not null,
	fuente_poder bigserial not null,
	costo_total decimal not null,
	constraint pk_computadora primary key(id),
	constraint fk_computador_procesador foreign key(procesador) references procesador(id) on delete cascade on update cascade,
	constraint fk_computador_disipador foreign key(disipador) references disipador_calor(id) on delete cascade on update cascade,
	constraint fk_computador_tm foreign key(tarjeta_madre) references tarjeta_madre(id) on delete cascade on update cascade,
	constraint fk_computador_ram foreign key(memoria_ram) references memoria_ram(id) on delete cascade on update cascade,
	constraint fk_computador_ram2 foreign key(memoria_ram_adicional) references memoria_ram(id) on delete cascade on update cascade,
	constraint fk_computador_dd foreign key(disco_duro) references disco_duro(id) on delete cascade on update cascade,
	constraint fk_computador_dd2 foreign key(disco_duro_adicional) references disco_duro(id) on delete cascade on update cascade,
	constraint fk_computador_tv foreign key(tarjeta_video) references tarjeta_video(id) on delete cascade on update cascade,
	constraint fk_computador_gabinete foreign key(gabinete) references gabinete(id) on delete cascade on update cascade,
	constraint fk_computador_fp foreign key(fuente_poder) references fuente_poder(id) on delete cascade on update cascade
);

create table venta(
	id bigserial not null,
	usuario bigserial not null,
	computadora bigserial not null,
	fecha_compra timestamp not null,
	cantidad integer not null,
	costo decimal not null,
	costo_envio decimal,
	costo_total decimal not null,
	lugar_envio text not null,
	referencias text,
	codigo_postal text not null,
	telefono text not null,
	constraint pk_venta primary key(id),
	constraint fk_venta_usuario foreign key(usuario) references usuario(id) on delete cascade on update cascade,
	constraint fk_venta_computadora foreign key(computadora) references computadora(id) on delete cascade on update cascade
);
