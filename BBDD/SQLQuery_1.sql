

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
    [NombreUsuario] NVARCHAR(25) NOT NULL UNIQUE,
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
    [IdContacto] INT IDENTITY(1,1) NOT NULL PRIMARY KEY, -- Primary Key column
    [Id_usuario] INT NOT NULL, 
    [Nombre] NVARCHAR(50) NOT NULL,
    [Apellidos] NVARCHAR(50) NOT NULL,
    [Email] NVARCHAR(100) NOT NULL,
    [Telefono] int NOT NULL,
    [Genero] varchar(25) NOT NULL,

    CONSTRAINT fkId_usuarioContactos FOREIGN KEY (Id_usuario)  REFERENCES Usuarios(Id)
    -- Specify more columns here
)


CREATE TABLE [dbo].[Notas]
(
    [IdNota] INT IDENTITY(1,1) NOT NULL PRIMARY KEY, -- Primary Key column
    [Id_usuario] INT NOT NULL,
    [Titulo] NVARCHAR(50) NOT NULL,
    [Nota] NVARCHAR(50) NOT NULL,
    

    CONSTRAINT fkId_usuarioNotas FOREIGN KEY (Id_usuario)  REFERENCES Usuarios(Id)
    -- Specify more columns here
   
)

CREATE TABLE [dbo].[Articulo]
(
    [IdArticulo] INT IDENTITY(1,1) NOT NULL PRIMARY KEY, -- Primary Key column
    [Id_usuario]  INT NOT NULL,
    [Nombre] NVARCHAR(50) NOT NULL,
    

     CONSTRAINT fkidUsuarioArticulo FOREIGN KEY (Id_usuario)  REFERENCES Usuarios(Id)
   
    -- Specify more columns here
)



CREATE TABLE [dbo].[Cartera]
(
<<<<<<< HEAD
    [idTarjeta] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,-- Primary Key column
=======
    [idCartera] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,-- Primary Key column
>>>>>>> andresyo
    [Id_usuario]  INT NOT NULL, 
    [Saldo] INT NOT NULL,

<<<<<<< HEAD
    CONSTRAINT fkIdUsuarioTarjetas FOREIGN KEY (Id_usuario)  REFERENCES Usuarios(Id)
=======
    CONSTRAINT fkIdUsuarioCartera FOREIGN KEY (Id_usuario)  REFERENCES Usuarios(Id)
   
  
    -- Specify more columns here
);


CREATE TABLE [dbo].[Transacciones]
(
    [idTransaccion] INT IDENTITY(1,1) NOT NULL PRIMARY KEY,-- Primary Key column
    [idCartera]  INT NOT NULL, 
    [texto] text NOT NULL,

    CONSTRAINT fkCarteraTran FOREIGN KEY (idCartera)  REFERENCES Cartera(idCartera)
>>>>>>> andresyo
   
  
    -- Specify more columns here
);
GO

