Feature: Login Aecode

  @test77
  Scenario Outline: Ingresar con credenciales validas
    Given que estoy en la pagina de Aecode
    And doy click en Acceder
    And doy click en Iniciar Sesion
    And ingreso el "<CorreoElectronico>" y "<Contrasena>"
    When hago clic en Continuar
    And hago clic en el perfil
    And hago clic en Mi Perfil
    And hago clic en Editar Informacion

    Examples:
      |CorreoElectronico|Contrasena|
      | wilfredomamani042@gmail.com| AEC23954922 |
      | erikomaraleval@gmail.com| AEC23999373 |
      | elva.guevara28@gmail.com| AEC23862645 |
      | corbacho263757@gmail.com| AEC71755366 |
      | thurar1596@gmail.com| AEC71937756 |
      | luisagabrielacondorimar@gmail.com| AEC72193906 |
      | hernan13u@gmail.com| AEC45141508 |
      | angel.fer.1095@gmail.com| AEC76278048 |
      | wildermc.07@gmail.com| AEC23961359 |
      | ingcesarcasas@gmail.com| AEC70716019 |
      | 70822611a@gmail.com| AEC70822611 |
      | lauralucia2535@gmail.com| AEC75092438 |
      | alevalmar001@gmail.com| AEC73088724 |
      | temitoqv@gmail.com| AEC72153170 |
      | roy1505qv@gmail.com| AEC70763355 |
      | kymc.ast.cop@gmail.com| AEC48438600 |
      | hi.migueling@gmail.com| AEC46893878 |
      | karenlmh2003@gmail.com| AEC72213283 |
      | jhosyth123@gmail.com| AEC73949124 |
      | jossuerojo1313@gmail.com| AEC72950588 |
      | 020201057g@uandina.edu.pe| AEC72371559 |
      | ndsr.tics.2107@gmail.com| AEC73540710 |
      | diaz90588@gmail.com| AEC73816733 |
      | martinformatics@gmail.com| AEC47000712 |
      | gabbravo8@gmail.com| AEC75102745 |
      | gcsh.ast.cal@gmail.com| AEC70171678 |
      | alexeholguinr01@gmail.com| AEC24005089 |
      | markito.sf12@gmail.com| AEC72246010 |
      | 120685@unsaac.edu.pe| AEC72694142 |
      | isabelmamanisa@gmail.com| AEC46518307 |
      | arq.kin.oviedo@gmail.com| AEC72280828 |
      | sterodchs@gmail.com| AEC72411314 |
      | ahsh.mod.arq@gmail.com| AEC71993299 |
      | 015201371k@uandina.edu.pe| AEC72577427 |
      | frank.machaca@gmail.com| AEC42012156 |
      | lenin.dj.lvla@gmail.com| AEC76297913 |
      | jcta.ast.sup@gmail.com| AEC73448022 |
      | cjcc.ast.imm@gmail.com| AEC76592079 |
      | joel.malpartida.guzman@gmail.com| AEC72809428 |
      | anacorteznp@gmail.com| AEC70585394 |
      | 233051@unsaac.edu.pe| AEC70576537 |
      | manriquefernandezbacaandrea@gmail.com| AEC70393462 |
      | orihuelaandy978@gmail.com| AEC72223624 |
      | yurfyukitake@gmail.com| AEC70032064 |
      | aygp.ast.cal@gmail.com| AEC60723277 |
      | kendalljchl@gmail.com| AEC41655522 |
      | crow.ht@gmail.com| AEC42721859 |
      | mero.cor.bim@gmail.com| AEC73202150 |
      | cristianpuma1998@gmail.com| AEC72451514 |
      | rodrigochacon940@gmail.com| AEC76034390 |
      | juliesni4@gmail.com| AEC72786336 |
      | nicochav21@gmail.com| AEC72789052 |
      | ramiro1184@gmail.com| AEC41416118 |
      | eleuaese@gmail.com| AEC47496743 |
      | diegobs888@gmail.com| AEC71792865 |
      | ahb.ast.ics@gmail.com| AEC44806471 |
      | candradevillafuerte@gmail.com| AEC70586215 |
      | breynersoto.lla@gmail.com| AEC76823428 |
      | jcb.ast.sup@gmail.com| AEC71468946 |
      | maxfrancopalomino77@gmail.com| AEC78289376 |
      | pgmq.ast.iiee@gmail.com| AEC47096964 |
      | edwinyucra260@gmail.com| AEC73613456 |
      | roximarsara@gmail.com| AEC46906423 |
      | enizar989@gmail.com| AEC45650911 |
      | henryfcp2016@gmail.com| AEC42451721 |
      | pdfo.res.gen@gmail.com| AEC42555519 |
      | elmerjoseperezcampos28@gmail.com| AEC75716166 |
      | plinio.cusihuallpa@gmail.com| AEC44688662 |
      | ingcesarcasas@gmail.com| AEC70716019 |
      | jorge.alfredo.matheus@gmail.com| AEC43975856 |
      | edu.farfan.merma@gmail.com| AEC41596803 |
      | pmc.ast.cal@gmail.com| AEC74870509 |
      | erikson.ccacya.99@gmail.com| AEC75778534 |
      | jour081084@gmail.com| AEC76176100 |
      | pigibebra@gmail.com| AEC42920835 |
      | amilcarpc75@gmail.com| AEC40220723 |
      | washington.delgado.ewdm@gmail.com| AEC42424567 |
      | ejohel.37@gmail.com| AEC46972467 |
      | mss.esp.iee@gmail.com| AEC41596796 |
      | yusai10.yac@gmail.com| AEC70413328 |
      | wileph@gmail.com| AEC45960426 |
      | mickymika1228@gmail.com| AEC71329023 |
      | joshedinm90@gmail.com| AEC40651286 |
      | dsah.esp.est@gmail.com| AEC44135854 |
      | gladysaymachoquenoa@gmail.com| AEC44113996 |
      | anelidcama@gmail.com| AEC72298752 |
      | melis.mpm@gmail.com| AEC72216919 |
      | remyqh@gmail.com| AEC74158958 |
      | aragonmermaluisdavid@gmail.com| AEC74659038 |
      | wiliamsbaltazar@hotmail.com| AEC43248681 |
      | cflorezdaniela@gmail.com| AEC40940321 |
      | grupolunaingenieroseirl@gmail.com| AEC23998199 |
      | dnicole.rn@gmail.com| AEC71418610 |
      | casayrton@gmail.com| AEC71993299 |
      | agfa.mod.bim@gmail.com| AEC76278048 |
      | roximarsara@gmail.com| AEC46906423 |
      | ing.felixnid@gmail.com| AEC70307908 |
      | gussam2020@gmail.com| AEC70379511 |
      | dant3santisteban@gmail.com| AEC23979942 |
      | marferque@gmail.com| AEC7760932 |
      | jeancarlotupayachi@gmail.com| AEC72859421 |
      | alcides.quispehuaman@gmail.com| AEC72430513 |
      | shaadita@gmail.com| AEC41588572 |
      | xiomarlu@gmail.com| AEC70585435 |
      | ryus7rq@gmail.com| AEC40436833 |
      | ayervepuchojimmy@gmail.com| AEC77099134 |
      | cgarategarate@gmail.com| AEC71695976 |
      | jimmymercadocastro@gmail.com| AEC41229035 |