;;Defining a template for representing/modelling sintoms in Jess Working Memory

(deftemplate sintoms
   	(slot sintomaA )
   	(slot sintomaB)
   	(slot sintomaC)
)

;;Storing four pacients (four facts) in Jess Working Memory via deffacts function 

(deffacts pacient
    (pacient  (sintomaA tos)  (sintomaB  flujo_nasal)  (sintomaC estornudos))
   	(pacient  (sintomaA dolor_de_cabeza) (sintomaB fiebre) (sintomaC escalofrios))
   	(pacient  (sintomaA aumento_de_peso)  (sintomaB dificultad_para_respirar)   (sintomaC cansancio))
	(pacient  (sintomaA tension_muscular) (sintomaB nauseas)   (sintomaC cansancio))
    (pacient  (sintomaA mal_aliento) (sintomaB vision_borrosa)   (sintomaC perdida_de_peso))
)