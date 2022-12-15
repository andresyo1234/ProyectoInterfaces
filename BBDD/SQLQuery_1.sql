

-- Create a new database called 'Agenda'
-- Connect to the 'master' database to run this snippet
USE master
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT [name]
        FROM sys.databases
        WHERE [name] = N'Agenda'
)
CREATE DATABASE Agenda
GO
USE Agenda

-- Create the table in the specified schema
CREATE TABLE [dbo].[Usuarios]
(
    [Id] INT IDENTITY(1,1) PRIMARY KEY, -- Primary Key column
    [NombreUsuario] NVARCHAR(25) NOT NULL,
    [Nombre] NVARCHAR(50) NOT NULL,
    [Apellidos] NVARCHAR(50) NOT NULL,
    [Email] NVARCHAR(100) NOT NULL,
    [Telefono] int NOT NULL,
    [Genero] varchar(25) NOT NULL,
    [password] NVARCHAR(25) NOT NULL
    -- Specify more columns here
)
GO

CREATE TABLE [dbo].[Contactos]
(
    [IdContacto] INT NOT NULL PRIMARY KEY, -- Primary Key column
    [Id_usuario] INT NOT NULL UNIQUE, 
    [Nombre] NVARCHAR(50) NOT NULL,
    [Apellidos] NVARCHAR(50) NOT NULL,
    [Email] NVARCHAR(100) NOT NULL,
    [Telefono] int NOT NULL,
    [Genero] varchar(25) NOT NULL,

    CONSTRAINT fkId_usuario FOREIGN KEY (Id_usuario)  REFERENCES Usuarios(Id)
    -- Specify more columns here
)


CREATE TABLE [dbo].[Notas]
(
    [IdNota] INT NOT NULL PRIMARY KEY, -- Primary Key column
    [Titulo] NVARCHAR(50) NOT NULL,
    [Nota] NVARCHAR(50) NOT NULL,
    [idusuario] INT NOT NULL UNIQUE,

    CONSTRAINT fkidusuario FOREIGN KEY (idusuario)  REFERENCES Usuarios(Id)
    -- Specify more columns here
   
)

CREATE TABLE [dbo].[Articulo]
(
    [IdArticulo] INT NOT NULL PRIMARY KEY, -- Primary Key column
    [Nombre] NVARCHAR(50) NOT NULL,
    [idUsuario]  INT NOT NULL UNIQUE,

     CONSTRAINT fkidUsuarioArticulo FOREIGN KEY (idUsuario)  REFERENCES Usuarios(Id)
   
    -- Specify more columns here
)



CREATE TABLE [dbo].[Tarjetas]
(
    [idTarjeta] INT NOT NULL PRIMARY KEY,-- Primary Key column
    [IdUsuario]  INT NOT NULL UNIQUE, 
    [Saldo] INT NOT NULL,
    [Caducidad] DATE NOT NULL,
    [Codigo] INT NOT NULL,
    [NumeroCuenta] NVARCHAR(100) NOT NULL,
    [Imagen] IMAGE NULL

    CONSTRAINT fkIdUsuarioTarjetas FOREIGN KEY (IdUsuario)  REFERENCES Usuarios(Id)
   
  
    -- Specify more columns here
);
GO

