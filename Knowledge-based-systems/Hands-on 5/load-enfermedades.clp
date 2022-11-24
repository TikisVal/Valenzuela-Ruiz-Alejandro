(defrule gripe 
    (sintomaA tos) (sintomaB flujo_nasal) (sintomaC estornudos) => (printout t “El paciente tiene gripe” crlf))

(defrule covid-19 
    (sintomaA dolor_de_cabeza) (sintomaB fiebre) (sintomaC escalofrios) => (printout t “El paciente tiene covid-19 crlf))

(defrule obesidad 
    (sintomaA aumento_de_peso) (sintomaB dificultad_para_respirar) (sintomaC cansancio) => (printout t “El paciente tiene obesidad crlf))

(defrule estres 
    (sintomaA tension_muscular) (sintomaB nauseas) (sintomaC cansancio) => (printout t “El paciente tiene estres crlf))

(defrule diabetes 
    (sintomaA mal_aliento) (sintomaB vision_borrosa) (sintomaC perdida_de_peso) => (printout t “El paciente tiene diabetes crlf))