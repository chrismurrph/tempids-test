(ns app.resolvers
  (:require
    [com.wsscode.pathom.connect :as pc]))

(pc/defmutation save-rule [env {:keys [tempid] :as params}]
  {::pc/sym `app.operations/save-rule}
  (println "params" params)
  (println "tempid on server" tempid)
  {:tempids {tempid 1}})

(def resolvers [save-rule])
