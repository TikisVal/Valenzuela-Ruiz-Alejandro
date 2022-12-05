(defrule stomachFlu
   (symptom (name ?n)) => (printout t ?n  crlf ))

(defrule my-rule2
   (person (age ?a)) => (printout t ?a  crlf ))

(defrule my-rule3
   (person (gender female) (name ?x)) => (printout t ?x " is female" crlf ))

(defrule my-rule4
   (person (partner ?p) (name ?n)) => (printout t ?p " is " ?n "'s partner" crlf ))
