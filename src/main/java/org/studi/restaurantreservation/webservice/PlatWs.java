package org.studi.restaurantreservation.webservice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.studi.restaurantreservation.pojo.Plat;
import org.studi.restaurantreservation.service.PlatService;

import java.util.List;

@RestController
@Tag(name="Plat", description="Gestion des plats") //   annotation pour la page swagger
@RequestMapping(ApiRegistration.REST_API+ApiRegistration.REST_PLAT)
public class PlatWs {

    @Autowired
    private PlatService platService;

    @Operation(
            summary = "Obtenir tous les plats ",
            description = "Les plats viennent de la BDD"
    )
    @GetMapping()
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = @Content(schema= @Schema(implementation= Plat.class))),
    })
    public List<Plat> getAllPlats() {
        return platService.getAllPlats();
    }

    @Operation(
            summary = "Obtenir 1 plat ",
            description = "Le plat vient de la BDD"
    )
    @GetMapping("/{id}")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = @Content(schema= @Schema(implementation= Plat.class))),
    })
    public Plat getPlatById(
            @Parameter(description = "id d'un plat", required = true) @PathVariable ("id") Long id) {
        return platService.getPlatById(id);
    }

    @Operation(
            summary = "Supprimer 1 plat selon sonid ",
            description = "suppression définitive"
    )
    @DeleteMapping("/{id}")
    @ApiResponses({
            @ApiResponse(responseCode = "200"),
    })
    public void deletePlatById(@PathVariable ("id") Long id) {
        platService.deletePlatById(id);
    }

    @Operation(
            summary = "Ajoute un plat ",
            description = "ajout en BDD"
    )
    @PostMapping
    @ApiResponses({
            @ApiResponse(responseCode = "200"),
    })
    public void createPlat(@RequestBody Plat plat) {
        platService.createPlat(plat);
    }

    @Operation(
            summary = "Modification du plat",
            description = "get , modif puis save"
    )
    @PutMapping("/{id}")
    @ApiResponses({
            @ApiResponse(responseCode = "200"),
    })
    public void updatePlatById(@PathVariable ("id") Long id, @RequestBody Plat plat) {
        platService.updatePlatById(id, plat);
    }
}
