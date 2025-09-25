Feature: Login Aecode

  @test88
  Scenario Outline: Ingresar con credenciales validas
    Given que estoy en la pagina de Aecode
    And doy click en Acceder
    And doy click en Iniciar Sesion
    And ingreso el "<CorreoElectronico>" y "<Contrasena>"
    When hago clic en Continuar
    And hago clic en el perfil
    And hago clic en Mi Perfil
    And hago clic en mis cursos

    Examples:
      |CorreoElectronico|Contrasena|
      |luzbelenlf@gmail.com|AEC73899801|
      |crojas.jauregui02@gmail.com|AEC74350444|
      |avilaroblesjudith@gmail.com|AEC71596833|
      |jachen150114@gmail.com|AEC71343556|
      |nomada.arq95@gmail.com|AEC70397600|
      |giancarlosmds08@gmail.com|AEC73176604|
      |julherbcb1997@gmail.com|AEC71468946|
      |robbcc117@gmail.com|AEC0603335464|
      |arq.olivares.antonio@gmail.com|AEC72783875|
      |chariarsealessandro@gmail.com|AEC71007358|
      |carloshtupa9@gmail.com|AEC77417209|
      |jarissacpchin@gmail.com|AEC71709293|
      |darkwasa1793@gmail.com|AEC72207867|
      |elvisalexei1995@gmail.com|AEC76669249|
      |wilmertellopujalla@gmail.com|AEC45834083|
      |josemiguel123x@gmail.com|AEC73064795|
      |jalonsoinga2004@gmail.com|AEC46445048K|
      |richard.enriquez.lavado@gmail.com|AEC74043680|
      |edwin13qh@gmail.com|AEC73421313|

