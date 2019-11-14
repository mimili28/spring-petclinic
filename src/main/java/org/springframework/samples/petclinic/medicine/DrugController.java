package org.springframework.samples.petclinic.medicine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
class DrugController {

    private static final String VIEWS_DRUG_CREATE_OR_UPDATE_FORM = "drugs/createOrUpdateDrugForm";
    private final DrugRepository drugs;

    @Autowired
    public DrugController(DrugRepository clinicService){
        this.drugs=clinicService;
    }


    @GetMapping("/drugs/new")
    public String initCreationForm(Map<String, Object> model) {
        Drug drug = new Drug();
        model.put("drug", drug);
        return VIEWS_DRUG_CREATE_OR_UPDATE_FORM;
    }

//    @PostMapping("/drugs/new")
//    public String processCreationForm(@Valid Drug drug, BindingResult result) {
//        if (result.hasErrors()) {
//            return VIEWS_DRUG_CREATE_OR_UPDATE_FORM;
//        } else {
//            this.drugs.save(drug);
//            return "redirect:/drugs/" + drug.getName();
//        }
//    }
//    @GetMapping("/owners/{drugId}/edit")
//    public String initUpdateOwnerForm(@PathVariable("drugId") int drugId, Model model) {
//        Drug drug = this.drugs.findById(drugId);
//        model.addAttribute(drug);
//        return VIEWS_DRUG_CREATE_OR_UPDATE_FORM;
//    }

    //    @PostMapping("/owners/{drugId}/edit")
//    public String processUpdateOwnerForm(@Valid Drug drug, BindingResult result, @PathVariable("drugId") int drugId) {
//        if (result.hasErrors()) {
//            return VIEWS_DRUG_CREATE_OR_UPDATE_FORM;
//        } else {
//            //drug.setId(drugId);
//            this.drugs.save(drug);
//            return "redirect:/drugs/{drugId}";
//        }
//    }
    @GetMapping("/drugs")
    public String showDrugList(Map<String, Object> model) {

        Drugs drugs = new Drugs();
        drugs.getDrugList().addAll(this.drugs.findAll());
        model.put("drugs", drugs);
        return "drugs/drugList";
    }
    @GetMapping({ "/drugs" })
    public @ResponseBody
    Drugs showResourcesDrugList() {
        Drugs drugs = new Drugs();
        drugs.getDrugList().addAll(this.drugs.findAll());
        return drugs;
    }



}
