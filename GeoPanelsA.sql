USE [master]
GO
/****** Object:  Database [GeoPanelsA]    Script Date: 11/11/2022 6:06:23 PM ******/
CREATE DATABASE [GeoPanelsA]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'GeoPanelsA', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\GeoPanelsA.mdf' , SIZE = 4288KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'GeoPanelsA_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\GeoPanelsA_log.ldf' , SIZE = 1072KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [GeoPanelsA] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [GeoPanelsA].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [GeoPanelsA] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [GeoPanelsA] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [GeoPanelsA] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [GeoPanelsA] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [GeoPanelsA] SET ARITHABORT OFF 
GO
ALTER DATABASE [GeoPanelsA] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [GeoPanelsA] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [GeoPanelsA] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [GeoPanelsA] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [GeoPanelsA] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [GeoPanelsA] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [GeoPanelsA] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [GeoPanelsA] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [GeoPanelsA] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [GeoPanelsA] SET  ENABLE_BROKER 
GO
ALTER DATABASE [GeoPanelsA] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [GeoPanelsA] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [GeoPanelsA] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [GeoPanelsA] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [GeoPanelsA] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [GeoPanelsA] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [GeoPanelsA] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [GeoPanelsA] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [GeoPanelsA] SET  MULTI_USER 
GO
ALTER DATABASE [GeoPanelsA] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [GeoPanelsA] SET DB_CHAINING OFF 
GO
ALTER DATABASE [GeoPanelsA] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [GeoPanelsA] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [GeoPanelsA] SET DELAYED_DURABILITY = DISABLED 
GO
USE [GeoPanelsA]
GO
/****** Object:  Table [dbo].[Bitacora]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Bitacora](
	[id_accion] [int] IDENTITY(1,1) NOT NULL,
	[usuario] [varchar](100) NOT NULL,
	[tabla_manipulada] [varchar](100) NOT NULL,
	[accion] [varchar](255) NOT NULL,
	[registro] [varchar](100) NOT NULL,
	[fechayhora] [varchar](15) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_accion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Carrito]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Carrito](
	[id_carrito] [int] IDENTITY(1,1) NOT NULL,
	[carrito] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_carrito] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Cliente]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Cliente](
	[id_cliente] [int] IDENTITY(1,1) NOT NULL,
	[nombre_cliente] [varchar](100) NOT NULL,
	[apellido_cliente] [varchar](100) NOT NULL,
	[dui] [varchar](10) NOT NULL,
	[direccion] [varchar](250) NOT NULL,
	[numero_telefonico] [varchar](9) NOT NULL,
	[correo] [varchar](50) NULL,
	[id_municipio] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Cobro]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cobro](
	[id_cobro] [int] IDENTITY(1,1) NOT NULL,
	[pago] [int] NOT NULL,
	[tarjeta] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_cobro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Codigo_recuperacion]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Codigo_recuperacion](
	[id_codigo] [int] IDENTITY(1,1) NOT NULL,
	[codigo] [int] NOT NULL,
	[estadoB] [char](1) NOT NULL,
	[id_usuario] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Compra]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Compra](
	[id_compra] [int] IDENTITY(1,1) NOT NULL,
	[total] [decimal](6, 2) NOT NULL,
	[descripcion] [varchar](250) NOT NULL,
	[fecha] [varchar](10) NOT NULL,
	[id_carrito] [int] NOT NULL,
	[id_establecimiento] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_compra] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Contrato]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Contrato](
	[id_contrato] [int] IDENTITY(1,1) NOT NULL,
	[mensualidad] [decimal](6, 2) NOT NULL,
	[garantia] [varchar](250) NOT NULL,
	[fecha_inicio] [varchar](10) NOT NULL,
	[fecha_fin] [varchar](10) NOT NULL,
	[rendimiento] [varchar](150) NOT NULL,
	[costo] [int] NOT NULL,
	[produccion] [int] NOT NULL,
	[recargo] [decimal](6, 2) NOT NULL,
	[id_cliente] [int] NOT NULL,
	[id_tipo_contrato] [int] NOT NULL,
	[codigo] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_contrato] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Departamentos]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Departamentos](
	[id_departamento] [int] IDENTITY(1,1) NOT NULL,
	[departamento] [varchar](150) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_departamento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[elemento_Carrito]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[elemento_Carrito](
	[id_elemento] [int] IDENTITY(1,1) NOT NULL,
	[id_carrito] [int] NOT NULL,
	[id_inventario] [int] NOT NULL,
	[cantidad] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_elemento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[elemento_carrito_compra]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[elemento_carrito_compra](
	[id_elemento] [int] IDENTITY(1,1) NOT NULL,
	[id_carrito] [int] NOT NULL,
	[id_proveedor] [int] NOT NULL,
	[id_producto] [int] NOT NULL,
	[cantidad] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_elemento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Empresa]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Empresa](
	[id_empresa] [int] IDENTITY(1,1) NOT NULL,
	[nombre_empresa] [varchar](100) NOT NULL,
	[giro_comercial] [varchar](150) NOT NULL,
	[razon_social] [varchar](150) NOT NULL,
	[correo] [varchar](50) NOT NULL,
	[logo] [varchar](100) NULL,
	[registro_patronal] [varchar](17) NOT NULL,
	[direccion] [varchar](250) NOT NULL,
	[representante] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_empresa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Establecimiento]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Establecimiento](
	[id_establecimiento] [int] IDENTITY(1,1) NOT NULL,
	[ubicacion] [varchar](250) NOT NULL,
	[numero_telefonico] [varchar](9) NOT NULL,
	[nombre_establecimiento] [varchar](100) NULL,
	[id_municipio] [int] NOT NULL,
	[id_empresa] [int] NOT NULL,
	[id_estado] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_establecimiento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Estado]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Estado](
	[id_estado] [int] IDENTITY(1,1) NOT NULL,
	[estado] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_estado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Estado_mantenimiento]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Estado_mantenimiento](
	[id_estado] [int] IDENTITY(1,1) NOT NULL,
	[estado] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_estado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Factura_Mantenimiento]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Factura_Mantenimiento](
	[id_facturaM] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [varchar](10) NOT NULL,
	[subtotal] [decimal](6, 2) NOT NULL,
	[id_mantenimiento] [int] NOT NULL,
	[id_impuesto] [int] NOT NULL,
	[total] [decimal](6, 2) NOT NULL,
	[id_pago] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_facturaM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Factura_Mantenimiento_Programado]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Factura_Mantenimiento_Programado](
	[id_facturaMP] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [varchar](10) NOT NULL,
	[subtotal] [decimal](6, 2) NOT NULL,
	[id_mantenimiento_programado] [int] NOT NULL,
	[id_impuesto] [int] NOT NULL,
	[total] [decimal](6, 2) NOT NULL,
	[id_pago] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_facturaMP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Factura_producto]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Factura_producto](
	[id_factura] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [varchar](10) NOT NULL,
	[subtotal] [decimal](6, 2) NOT NULL,
	[id_carrito] [int] NOT NULL,
	[id_costo] [int] NOT NULL,
	[id_cliente] [int] NOT NULL,
	[id_impuesto] [int] NOT NULL,
	[total] [decimal](6, 2) NOT NULL,
	[id_pago] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_factura] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Impuestos_producto]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Impuestos_producto](
	[id_impuesto] [int] IDENTITY(1,1) NOT NULL,
	[precio] [decimal](6, 2) NOT NULL,
	[fecha] [varchar](10) NULL,
	[impuesto] [varchar](150) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_impuesto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Inventario]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Inventario](
	[id_inventariado] [int] IDENTITY(1,1) NOT NULL,
	[cantidad] [int] NULL,
	[fecha_ingreso] [varchar](10) NOT NULL,
	[id_establecimiento] [int] NOT NULL,
	[id_producto] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_inventariado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Mantenimiento_Generado]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Mantenimiento_Generado](
	[id_mantenimiento] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [varchar](10) NOT NULL,
	[descripcion] [varchar](250) NOT NULL,
	[id_contrato] [int] NOT NULL,
	[id_tipo] [int] NOT NULL,
	[id_usuario] [int] NOT NULL,
	[id_estado_mantenimiento] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_mantenimiento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Mantenimiento_Programado]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Mantenimiento_Programado](
	[id_mantenimiento_programado] [int] IDENTITY(1,1) NOT NULL,
	[fechayhora] [varchar](15) NULL,
	[descripcion] [varchar](250) NOT NULL,
	[id_contrato] [int] NOT NULL,
	[id_tipo] [int] NOT NULL,
	[id_usuario] [int] NOT NULL,
	[id_estado_mantenimiento] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_mantenimiento_programado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Marca]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Marca](
	[id_marca] [int] IDENTITY(1,1) NOT NULL,
	[marca] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_marca] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Municipio]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Municipio](
	[id_municipio] [int] IDENTITY(1,1) NOT NULL,
	[id_departamento] [int] NOT NULL,
	[municipio] [varchar](200) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_municipio] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Pago]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Pago](
	[id_pago] [int] IDENTITY(1,1) NOT NULL,
	[pago] [varchar](250) NULL,
	[MontoPago] [decimal](6, 2) NULL,
	[MontoRecibo] [decimal](6, 2) NULL,
	[MontoRetorno] [decimal](6, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_pago] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Preguntas]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Preguntas](
	[id_pregunta] [int] IDENTITY(1,1) NOT NULL,
	[pregunta] [varchar](100) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_pregunta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Produccion]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Produccion](
	[id_produccion] [int] IDENTITY(1,1) NOT NULL,
	[id_producto] [int] NOT NULL,
	[produccion] [varchar](250) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_produccion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Producto]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Producto](
	[id_producto] [int] IDENTITY(1,1) NOT NULL,
	[sku] [varchar](16) NOT NULL,
	[nombre_producto] [varchar](100) NOT NULL,
	[descripcion] [varchar](250) NOT NULL,
	[id_marca] [int] NOT NULL,
	[id_tipo_producto] [int] NOT NULL,
	[id_tipo] [int] NOT NULL,
	[precio_entrada] [decimal](6, 2) NULL,
	[precio_salida] [decimal](6, 2) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_producto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Proveedor]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Proveedor](
	[id_proveedor] [int] IDENTITY(1,1) NOT NULL,
	[nombre_empresa] [varchar](100) NOT NULL,
	[nombre_proveedor] [varchar](100) NOT NULL,
	[numero_telefono] [varchar](9) NOT NULL,
	[correo] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_proveedor] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Respuestas]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Respuestas](
	[id_respuesta] [int] IDENTITY(1,1) NOT NULL,
	[id_usuario] [int] NOT NULL,
	[id_pregunta1] [int] NOT NULL,
	[respuesta1] [varchar](100) NOT NULL,
	[id_pregunta2] [int] NOT NULL,
	[respuesta2] [varchar](100) NOT NULL,
	[id_pregunta3] [int] NOT NULL,
	[respuesta3] [varchar](100) NOT NULL,
	[id_pregunta4] [int] NOT NULL,
	[respuesta4] [varchar](100) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_respuesta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tarjeta]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tarjeta](
	[id_tarjeta] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](250) NOT NULL,
	[apellido] [varchar](250) NOT NULL,
	[pan] [varchar](250) NOT NULL,
	[vencimiento] [varchar](250) NOT NULL,
	[cvv] [varchar](250) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_tarjeta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tipo]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo](
	[id_tipo] [int] IDENTITY(1,1) NOT NULL,
	[tipo] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_tipo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tipo_contrato]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_contrato](
	[id_tipo_contrato] [int] IDENTITY(1,1) NOT NULL,
	[tipo_contrato] [varchar](100) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_tipo_contrato] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tipo_empleado]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_empleado](
	[id_tipo_empleado] [int] IDENTITY(1,1) NOT NULL,
	[tipo_empleado] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_tipo_empleado] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tipo_mantenimiento]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_mantenimiento](
	[id_tipo_mantenimiento] [int] IDENTITY(1,1) NOT NULL,
	[tipo_mantenimiento] [varchar](150) NOT NULL,
	[costo] [decimal](6, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_tipo_mantenimiento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tipo_producto]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_producto](
	[id_tipo_producto] [int] IDENTITY(1,1) NOT NULL,
	[tipo_producto] [varchar](150) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_tipo_producto] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Usuario]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Usuario](
	[id_usuario] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](100) NOT NULL,
	[apellido] [varchar](100) NOT NULL,
	[direccion] [varchar](250) NOT NULL,
	[numero_telefonico] [varchar](9) NOT NULL,
	[correo] [varchar](100) NOT NULL,
	[nombre_usuario] [varchar](50) NOT NULL,
	[contraseña] [varchar](50) NOT NULL,
	[fecha_nacimiento] [varchar](10) NOT NULL,
	[genero] [varchar](25) NULL,
	[id_estado] [int] NOT NULL,
	[id_tipo_empleado] [int] NOT NULL,
	[id_establecimiento] [int] NOT NULL,
	[perfil] [varchar](100) NULL,
	[primer_uso] [int] NULL,
	[contra] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  StoredProcedure [dbo].[combomarca]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[combomarca]
As
Select*from estado



GO
/****** Object:  StoredProcedure [dbo].[contra]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

Create procedure [dbo].[contra]
As
Select*from contrato



GO
/****** Object:  StoredProcedure [dbo].[nombre]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

Create procedure [dbo].[nombre]
As
Select*from producto


GO
/****** Object:  StoredProcedure [dbo].[pregunta1]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE procedure [dbo].[pregunta1]
as
select*from Preguntas



GO
/****** Object:  StoredProcedure [dbo].[pregunta2]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE procedure [dbo].[pregunta2]
as
select*from Preguntas



GO
/****** Object:  StoredProcedure [dbo].[pregunta3]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE procedure [dbo].[pregunta3]
as
select*from Preguntas



GO
/****** Object:  StoredProcedure [dbo].[pregunta4]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE procedure [dbo].[pregunta4]
as
select*from Preguntas



GO
/****** Object:  StoredProcedure [dbo].[tecnico]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

Create procedure [dbo].[tecnico]
As
Select*from usuario



GO
/****** Object:  StoredProcedure [dbo].[tiopp]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE procedure [dbo].[tiopp]
As
Select*from Tipo



GO
/****** Object:  StoredProcedure [dbo].[TipoContrato]    Script Date: 11/11/2022 6:06:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

create procedure [dbo].[TipoContrato]
as
Select*from Tipo_contrato



GO
USE [master]
GO
ALTER DATABASE [GeoPanelsA] SET  READ_WRITE 
GO
