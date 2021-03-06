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
	correoelectronico text not null,
	contrasenia text not null,
	constraint pk_usuario primary key(id)
);

-- ---------------------------------------------------------
-- CREACION DE LAS TABLAS PARA EL PROYECTO DE VENTA DE PC´S
-- ---------------------------------------------------------
create table marcaprocesador(
	id bigserial not null,
	nombre text not null,
	idimagen bigserial not null,
	constraint pk_procesador_marca primary key(id),
	constraint fk_mp_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);
create table procesador(
	id bigserial not null,
	idmarca bigserial not null,
	modelo text not null,
	idimagen bigserial not null,
	nucleos integer not null,
	hilosdeprocesamiento integer,
	frecuenciabase decimal,
	tdp decimal,
	precio decimal not null,
	cantidades integer,
	descripcion text,
	constraint pk_procesador primary key(id),
	constraint fk_procesador_marca foreign key(idmarca) references marcaprocesador(id) on delete cascade on update cascade,
	constraint fk_procesador_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);

create table disipadorcalor(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	idimagen bigserial not null,
	tdp decimal,
	tubostermicos integer,
	ancho decimal,
	alto decimal,
	precio decimal not null,
	cantidad integer,
	descripcion text,
	constraint pk_disipador primary key(id),
	constraint fk_disipador_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);

create table tamaniotm(
	id bigserial not null,
	tamanio text not null,
	constraint pk_tamanio_tm primary key(id)
);

create table tarjetamadre(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	idimagen bigserial not null,
	ram text not null,
	almacenamiento text not null,
	precio decimal not null,
	cantidad integer,
	descripcion text,
	idtamanio bigserial not null,
	idprocesador bigserial not null,
	constraint pk_tarjeta_madre primary key(id),
	constraint fk_tamanio_tm foreign key(idtamanio) references tamaniotm(id) on delete cascade on update cascade,
	constraint fk_tarjeta_procesador foreign key(idprocesador) references marcaprocesador(id) on delete cascade on update cascade,
	constraint fk_tm_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);

create table memoriaram(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	idimagen bigserial not null,
	velocidad decimal not null,
	capacidad integer not null,
	precio decimal not null,
	tipo text,
	cantidad integer,
	descripcion text,
	constraint pk_memoria_ram primary key(id),
	constraint fk_ram_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);

create table discoduro(
	id bigserial,
	marca text not null,
	modelo text not null,
	idimagen bigserial not null,
	factordeforma text not null,
	rpm integer not null,
	interfaz text not null,
	capacidad integer not null,
	tipo text,
	precio decimal not null,
	descripcion text,
	constraint pk_disco_duro primary key(id),
	constraint fk_disco_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);

create table tarjetavideo(
	id bigserial not null,
	marca text not null,
	modelo text not null,
	idimagen bigserial not null,
	vram text not null,
	ram integer not null,
	conexion text,
	descripcion text,
	precio decimal not null,
	cantidad integer,
	constraint pk_tarjeta_video primary key(id),
	constraint fk_tv_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);

create table gabinete(
	id bigserial not null,
	idimagen bigserial not null,
	idtamaniotm bigserial not null,
	marca text not null,
	modelo text not null,
	descripcion text,
	precio decimal not null,
	cantidad integer,
	constraint pk_gabinete primary key(id),
	constraint fk_tamanio_gabinete foreign key(idtamaniotm) references tamaniotm(id) on delete cascade on update cascade,
	constraint fk_gabinete_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);

create table fuentepoder(
	id bigserial not null,
	idimagen bigserial not null,
	idtamaniotm bigserial not null,
	marca text not null,
	modelo text not null,
	precio decimal not null,
	cantidad integer,
	descripcion text,
	constraint pk_fuente primary key(id),
	constraint fk_fuente_tm foreign key(idtamaniotm) references tamaniotm(id) on delete cascade on update cascade,
	constraint fk_fuentepoder_imagen foreign key(idimagen) references imagen(id) on delete cascade on update cascade
);

create table procesadordisipador(
        id bigserial not null,
	idprocesador bigserial not null,
	iddisipador bigserial not null,
	constraint pk_procesador_disipador primary key(id),
	constraint fk_procesador foreign key(idprocesador) references marcaprocesador(id) on delete cascade on update cascade,
	constraint fk_disipador foreign key(iddisipador) references disipadorcalor(id) on delete cascade on update cascade
);

create table computadora(
	id bigserial not null,
	idprocesador bigserial not null,
	iddisipador bigserial not null,
	idtarjetamadre bigserial not null,
	idmemoriaram bigserial not null,
	idmemoriaramadicional bigserial not null,
	iddiscoduro bigserial not null,
	iddiscoduroadicional bigserial not null,
	idtarjetavideo bigserial not null,
	idgabinete bigserial not null,
	idfuentepoder bigserial not null,
	costototal decimal not null,
	constraint pk_computadora primary key(id),
	constraint fk_computador_procesador foreign key(idprocesador) references procesador(id) on delete cascade on update cascade,
	constraint fk_computador_disipador foreign key(iddisipador) references disipadorcalor(id) on delete cascade on update cascade,
	constraint fk_computador_tm foreign key(idtarjetamadre) references tarjetamadre(id) on delete cascade on update cascade,
	constraint fk_computador_ram foreign key(idmemoriaram) references memoriaram(id) on delete cascade on update cascade,
	constraint fk_computador_ram2 foreign key(idmemoriaramadicional) references memoriaram(id) on delete cascade on update cascade,
	constraint fk_computador_dd foreign key(iddiscoduro) references discoduro(id) on delete cascade on update cascade,
	constraint fk_computador_dd2 foreign key(iddiscoduroadicional) references discoduro(id) on delete cascade on update cascade,
	constraint fk_computador_tv foreign key(idtarjetavideo) references tarjetavideo(id) on delete cascade on update cascade,
	constraint fk_computador_gabinete foreign key(idgabinete) references gabinete(id) on delete cascade on update cascade,
	constraint fk_computador_fp foreign key(idfuentepoder) references fuentepoder(id) on delete cascade on update cascade
);

create table venta(
	id bigserial not null,
	idusuario bigserial not null,
	idcomputadora bigserial not null,
	fechacompra timestamp not null,
	cantidad integer not null,
	costo decimal not null,
	costoenvio decimal,
	costototal decimal not null,
	lugarenvio text not null,
	referencias text,
	codigopostal text not null,
	telefono text not null,
	constraint pk_venta primary key(id),
	constraint fk_venta_usuario foreign key(idusuario) references usuario(id) on delete cascade on update cascade,
	constraint fk_venta_computadora foreign key(idcomputadora) references computadora(id) on delete cascade on update cascade
);
