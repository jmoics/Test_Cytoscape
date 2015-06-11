//$(function(){ // on dom ready, esto funciona para html
//jq(function(){ // on dom ready, esto funciona en zk pero con los tags html (h:)
zk.afterMount(function(){ // on dom ready, esto si funciona para zk en la carga sin un evento
//function testjq(){

$(jq('$cy')).cytoscape({
  style: cytoscape.stylesheet()
    .selector('node')
      .css({
        'width': '80px',
        'height': '80px',
        'background-fit': 'cover',
        'content': 'data(nombre)'
      })
    .selector('edge')
      .css({
        'width': 2,
        /*'target-arrow-shape': 'triangle',*/
        'opacity': 1,
        'content': 'data(line_name)',
        'font-size': 8,
        'haystack-radius': 0
      })
    .selector(':selected')
      .css({
        'background-color': 'black',
        'line-color': 'black',
        'target-arrow-color': 'black',
        'source-arrow-color': 'black',
        'opacity': 1
      })
    .selector('.faded')
      .css({
        'opacity': 0.25,
        'text-opacity': 0
      })
    .selector('#00001')
      .css({
        'background-image': 'images/00001.jpg'
      })
    .selector('#00002')
      .css({
        'background-image': 'images/00002.jpg'
      })
    .selector('#00003')
      .css({
        'background-image': 'images/00003.jpg'
      })
    .selector('#00004')
      .css({
        'background-image': 'images/00004.jpg'
      })
    .selector('#00005')
      .css({
        'background-image': 'images/00005.jpg'
      })
    .selector('#00006')
      .css({
        'background-image': 'images/00006.jpg'
      })
    .selector('#00007')
      .css({
        'background-image': 'images/00007.jpg'
      })
    .selector('#00008')
      .css({
        'background-image': 'images/00008.jpg'
      })
    .selector('#00009')
      .css({
        'background-image': 'images/00009.jpg'
      })
    .selector('#00010')
      .css({
        'background-image': 'images/00010.jpg'
      }),
    
  elements: {
    nodes: [
      { data: { id: '00001', nombre: 'Jorge' } },
      { data: { id: '00002', nombre: 'Miguel' } },
      { data: { id: '00003', nombre: 'Juanxo' } },
      { data: { id: '00004', nombre: 'Daniel' } },
      { data: { id: '00005', nombre: 'Margarita' } },
      { data: { id: '00006', nombre: 'Angel' } },
      { data: { id: '00007', nombre: 'Gringa' } },
      { data: { id: '00008', nombre: 'Gato' } },
      { data: { id: '00009', nombre: 'Visha' } }
    ],
    edges: [
      { data: { id: '00001_00002', source: '00001', target: '00002', line_name: 'Amigos' } },
      { data: { id: '00001_00003', source: '00001', target: '00003', line_name: 'Amo-Mascota' } },
      { data: { id: '00001_00004', source: '00001', target: '00004', line_name: 'Amigos' } },
      { data: { id: '00002_00008', source: '00002', target: '00008', line_name: 'Parientes' } },
      { data: { id: '00006_00005', source: '00006', target: '00005', line_name: 'Amigos' } },
      { data: { id: '00006_00007', source: '00006', target: '00007', line_name: 'Amigas' } },
      { data: { id: '00004_00005', source: '00004', target: '00005', line_name: 'Amigas' } },
      { data: { id: '00005_00003', source: '00005', target: '00003', line_name: 'Amigas' } },
      { data: { id: '00005_00008', source: '00005', target: '00008', line_name: 'Amo-Mascota' } },
      { data: { id: '00008_00007', source: '00008', target: '00007', line_name: 'Cena' } },
      { data: { id: '00009_00002', source: '00009', target: '00002', line_name: 'Cheroca' } },
      { data: { id: '00009_00007', source: '00009', target: '00007', line_name: 'Hermanos' } },
      { data: { id: '00009_00003', source: '00009', target: '00003', line_name: 'Primos'} }
    ]
  },
  
  layout: {
    name: 'grid',
    padding: 10,
    fit: true,
    avoidOverlap: true,
    sort: undefined,
    animate: true
  },
  
  ready: function(){
    window.cy = this;
  }
});

}); // on dom ready